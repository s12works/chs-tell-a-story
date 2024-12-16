package com.s12works.tellAStory.graphics

import com.s12works.tellAStory.graphics.colorUtil.IndexValue
import com.s12works.tellAStory.graphics.colorUtil.validated

public class Color {
    public val red: IndexValue
    public val green: IndexValue
    public val blue: IndexValue

    public constructor(red: IndexValue, green: IndexValue, blue: IndexValue) {
        this.red = validated(red)
        this.green = validated(green)
        this.blue = validated(blue)
    }

    override fun toString(): com.s12works.tellAStory.objectRepresentation.Translation =
        com.s12works.tellAStory.objectRepresentation.getStandardRepr(this)

    override fun equals(other: Any?): Boolean = (
        other is Color &&
        this.red == other.red &&
        this.green == other.green &&
        this.blue == other.blue
    )
}
