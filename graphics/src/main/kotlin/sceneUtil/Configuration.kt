package com.s12works.tellAStory.graphics.sceneUtil

public data class Configuration(
    public val window: com.s12works.tellAStory.graphics.Window,
    public val background: com.s12works.tellAStory.graphics.Color,
    public val objects: Collection<Object>
) {
    override fun toString(): com.s12works.tellAStory.objectRepresentation.Translation =
        com.s12works.tellAStory.objectRepresentation.getStandardRepr(this)
}
