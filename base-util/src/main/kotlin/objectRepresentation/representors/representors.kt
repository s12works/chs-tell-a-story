package com.s12works.tellAStory.objectRepresentation.representors

import com.s12works.tellAStory.objectRepresentation.Representation
import com.s12works.tellAStory.objectRepresentation.Property
import kotlin.reflect.KProperty

@FromStandardLibrary
public fun <O: Any> standard(obj: O): Representation {
    val kProperties = obj::class.members.filterIndexed { index: Int, member: kotlin.reflect.KCallable<*> ->
        member is KProperty<*>
    } as Collection<KProperty<*>>

    return Representation(
        obj::class.simpleName,
        com.s12works.tellAStory.getDynamicallyCreatedCollection<KProperty<*>, Property<Any?>>(
            kProperties,
            { Property<Any?>(it.name, it.call()) }
        )
    )
}
