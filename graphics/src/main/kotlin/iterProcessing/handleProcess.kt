package com.s12works.tellAStory.graphics.iterProcessing

@Throws(IteratorIncompatibilityException::class)
public fun <I> handleProcess(config: ProcessHandlerConfig<I>): Unit {
    for (i in 0..config.timeout) {
        try {
            config.run {
                process(iterator.next())
            }
        } catch (exc: NoSuchElementException) {
            throw IteratorIncompatibilityException(i, config.timeout)
        }
    }
}
