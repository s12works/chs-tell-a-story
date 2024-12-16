package com.s12works.tellAStory.range

public data class Range(
    public val minimum: Minimum,
    public val maximum: Maximum
) {
    override fun toString(): com.s12works.tellAStory.objectRepresentation.Translation =
        com.s12works.tellAStory.objectRepresentation.getStandardRepr(this)
}
