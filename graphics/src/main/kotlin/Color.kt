package com.s12works.tellAStory.graphics

import com.s12works.tellAStory.graphics.rgb.IndexValue

public data class Color(
    public val red: IndexValue,
    public val green: IndexValue,
    public val blue: IndexValue
) {
    override fun toString(): com.s12works.tellAStory.objectRepresentation.Translation =
        com.s12works.tellAStory.objectRepresentation.getStandardRepr(this)
}
