package com.s12works.tellAStory.graphics

import com.s12works.tellAStory.assertion.enforcers.fail
import com.s12works.tellAStory.graphics.rgb.isValid

public class Pixel {
    public val position: Position
    public val color: Color

    public constructor(pos: Position, color: Color) {
        this.position = pos
        this.color = com.s12works.tellAStory.assertion.validated(
            com.s12works.tellAStory.graphics.rgb.getValidationFailureMessage(color),
            ::fail,
            color,
            ::isValid
        )
    }
    
    override fun toString(): com.s12works.tellAStory.objectRepresentation.Translation =
        com.s12works.tellAStory.objectRepresentation.getStandardRepr(this)

    override fun equals(other: Any?): Boolean = (
        other is Pixel &&
        this.position == other.position &&
        this.color == other.color
    )
}
