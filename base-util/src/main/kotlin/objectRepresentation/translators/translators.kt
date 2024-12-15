package com.s12works.tellAStory.objectRepresentation.translators

import com.s12works.tellAStory.objectRepresentation.Representation
import com.s12works.tellAStory.objectRepresentation.Translation

@FromStandardLibrary
public fun standard(representation: Representation): Translation {
    val translations = com.s12works.tellAStory.getDynamicallyCreatedCollection(
        representation.properties,
        { "${it.name}=${it.value}" }
    )

    return "${representation.name ?: com.s12works.tellAStory.objectRepresentation.genericObjectName}(${translations.joinToString(separator=", ")})"
}
