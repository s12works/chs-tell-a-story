package com.s12works.tellAStory.objectRepresentation

public data class Representation(
    public val name: Name?,
    public val properties: Collection<Property<Any?>>
)
