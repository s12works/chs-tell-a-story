package com.s12works.tellAStory.assertion

/**
 * consists of all vital components required for representing/identifying an assertion failure
 *
 * @property message serves as the respective error-message
 * @property assessor represents the function that provided the assessment
 */
public data class Reciept(
    public val message: Message,
    public val assessor: () -> Assessment
) {
    /**
     * provides a string-representation of the object
     *
     * @return string-representation provided as [com.s12works.tellAStory.objectRepresentation.Translation]
     * @see com.s12works.tellAStory.objectRepresentation.getStandardRepr
     */
    override fun toString(): com.s12works.tellAStory.objectRepresentation.Translation =
        com.s12works.tellAStory.objectRepresentation.getStandardRepr(this)
}
