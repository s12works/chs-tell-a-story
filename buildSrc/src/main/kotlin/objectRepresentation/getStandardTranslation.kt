package com.s12works.tellAStory.objectRepresentation

public fun getStandardTranslation(repr: Representation): Translation {
    val translations = com.s12works.tellAStory.getDynamicallyCreatedCollection(
        repr.properties,
        { "${it.name}=${it.value}" }
    )

    return "${repr.name ?: genericObjectName}(${translations.joinToString(separator=", ")})"
}
