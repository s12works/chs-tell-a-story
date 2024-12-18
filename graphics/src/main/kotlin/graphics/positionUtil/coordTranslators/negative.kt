package com.s12works.tellAStory.graphics.positionUtil.coordTranslators

@FromStandardLibrary
public val negative: Translator = {
    coordinate: com.s12works.tellAStory.graphics.Coordinate -> -coordinate
}
