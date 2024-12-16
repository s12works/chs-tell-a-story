package com.s12works.tellAStory.graphics

public data class Pixel(
    public val position: Position,
    public val color: Color
) {
    override public fun toString(): com.s12works.tellAStory.objectRepresentation.Translation =
        com.s12works.tellAStory.objectRepresentation.getStandardRepr(this)
}
