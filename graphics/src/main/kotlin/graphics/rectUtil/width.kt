package com.s12works.tellAStory.graphics.rectUtil

public fun width(rectangle: Rectangle): Dimension =
    kotlin.math.abs(rectangle.corner1.xpos - rectangle.corner1.xpos)
