package com.s12works.tellAStory.assertion

public data class Reciept(
    public val message: Message,
    public val assessor: () -> Assessment
) {
    override fun toString(): com.s12works.tellAStory.objectRepresentation.Translation =
        com.s12works.tellAStory.objectRepresentation.getStandardRepr(this)
}
