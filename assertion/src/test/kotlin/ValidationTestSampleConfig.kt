package com.s12works.tellAStory.test.assertion

public data class ValidationTestSampleConfig<T>(
    public val objects: Collection<T>,
    public val assessors: Collection<(T) -> com.s12works.tellAStory.assertion.Assessment>
) {   
    override fun toString(): com.s12works.tellAStory.objectRepresentation.Translation =
        com.s12works.tellAStory.objectRepresentation.getStandardRepr(this)   
}
