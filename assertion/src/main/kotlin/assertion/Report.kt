package com.s12works.tellAStory.assertion

/**
 * contains all that which is necessary for processing/representing errors
 * 
 * @property reciept represents the report's required [Reciept] (or representation of the error)
 * @property occurance represents the occurance of the error temporally
 */
public data class Report(
    public val reciept: Reciept,
    public val occurance: java.time.LocalDateTime
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
