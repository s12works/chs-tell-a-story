package com.s12works.tellAStory.graphics

public data class Position(
    public val xpos: Coordinate,
    public val ypos: Coordinate
) {
    override fun toString(): com.s12works.tellAStory.objectRepresentation.Translation =
        com.s12works.tellAStory.objectRepresentation.getStandardRepr(this)
}
