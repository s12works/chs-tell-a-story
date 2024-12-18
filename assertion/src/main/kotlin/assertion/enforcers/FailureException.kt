package com.s12works.tellAStory.assertion.enforcers

public class FailureException internal constructor(
    public val report: com.s12works.tellAStory.assertion.Report
): Exception(report.reciept.message) {
    override fun toString(): com.s12works.tellAStory.objectRepresentation.Translation =
        com.s12works.tellAStory.objectRepresentation.getStandardRepr(this)
 
    // potentially remaster to include auto-gen message as qualification   
    override fun equals(other: Any?): Boolean = (
        other is FailureException &&
        this.report == other.report
    )
}
