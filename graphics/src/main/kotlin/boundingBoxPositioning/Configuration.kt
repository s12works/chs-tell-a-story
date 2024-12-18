package com.s12works.tellAStory.graphics.boundingBoxPositioning

public class Configuration {
    public val width: Percentage
    public val height: Percentage

    public constructor(width: Percentage, height: Percentage) {
        this.width = validated(width)
        this.height = validated(height)
    }
    
    override fun toString(): com.s12works.tellAStory.objectRepresentation.Translation =
        com.s12works.tellAStory.objectRepresentation.getStandardRepr(this)

    override fun equals(other: Any?): Boolean = (
        other is Configuration &&
        this.width == other.width &&
        this.height == other.height
    )
}
