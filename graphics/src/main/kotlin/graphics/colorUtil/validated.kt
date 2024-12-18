package com.s12works.tellAStory.graphics.colorUtil

import com.s12works.tellAStory.assertion.enforcers.fail

public fun validated(value: IndexValue): IndexValue = com.s12works.tellAStory.assertion.validated(
    getValidationFailureMessage(value),
    ::fail,
    value,
    ::isValid
)
