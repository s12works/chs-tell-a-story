package com.s12works.tellAStory.iterProcessing

import com.s12works.tellAStory.range.contains
import com.s12works.tellAStory.assertion.enforcers.fail

public class ProcessHandlerConfig<I> {
    public val iterator: Iterator<I>
    public val timeout: Timeout
    public val process: Process<I>

    public constructor(iterator: Iterator<I>, timeout: Timeout, process: Process<I>) {
        this.iterator = iterator
        this.timeout = com.s12works.tellAStory.assertion.validated(
            getValidationFailureMessage(timeout),
            ::fail,
            timeout
        ) {
            timeout in com.s12works.tellAStory.ranges.positive
        }
        this.process = process
    }
    
    override fun toString(): com.s12works.tellAStory.objectRepresentation.Translation =
        com.s12works.tellAStory.objectRepresentation.getStandardRepr(this)

    override fun equals(other: Any?): Boolean = (
        other is ProcessHandlerConfig<*> &&
        this.iterator == other.iterator &&
        this.timeout == other.timeout &&
        this.process == other.process
    )
}
