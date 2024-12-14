package com.s12works.tellAStory.objectRepresentation

import kotlin.reflect.KProperty

public fun getStandardRepr(obj: Any): Representation {
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
