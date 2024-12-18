package com.s12works.tellAStory.graphics.iterProcessing

public class IteratorIncompatibilityException internal constructor(
    public val count: Int,
    public val timeout: Timeout
): Exception("iterator deemed incompatibly when processing; excecuted $count of $timeout processes") {
    override fun toString(): com.s12works.tellAStory.objectRepresentation.Translation =
        "${this::class.simpleName}(count=${this.count}, timeout=${this.timeout}"
    
    override fun equals(other: Any?): Boolean = (
        other is IteratorIncompatibilityException &&
        this.count == other.count &&
        this.timeout == other.timeout
    )
}
