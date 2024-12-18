package com.s12works.tellAStory.graphics.boundingBoxPositioning

public enum class Type(config: Configuration) {
    BOTTOM_LEFT(Configuration(0, 0)),
    BOTTOM_RIGHT(Configuration(100, 0)),
    TOP_LEFT(Configuration(0, 100)),
    TOP_RIGHT(Configuration(100, 100)),
    CENTER(Configuration(50, 50))
}
