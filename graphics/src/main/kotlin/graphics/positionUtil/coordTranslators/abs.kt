package com.s12works.tellAStory.graphics.positionUtil.coordTranslators

@FromStandardLibrary
public val abs: Translator = {
    coordinate: com.s12works.tellAStory.graphics.Coordinate -> kotlin.math.abs(coordinate)
}
