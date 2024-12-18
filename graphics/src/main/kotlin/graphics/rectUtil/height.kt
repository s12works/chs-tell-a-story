package com.s12works.tellAStory.graphics.rectUtil

public fun height(rectangle: Rectangle): Dimension =
    kotlin.math.abs(rectangle.corner1.ypos - rectangle.corner2.ypos)
