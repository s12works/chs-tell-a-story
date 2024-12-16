package com.s12works.tellAStory.range

public fun isValid(range: Range): com.s12works.tellAStory.assertion.Assessment = when (
    com.s12works.tellAStory.getDynamicallyCreatedCollection(
        listOf(range.minimum, range.maximum),
        { it != null }
    ).all { it }
) {
    true -> range.minimum!! <= range.maximum!!
    false -> true
}
