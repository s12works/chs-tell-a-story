package com.s12works.tellAStory.ranges

import com.s12works.tellAStory.range.Range
import com.s12works.tellAStory.range.isValid
import com.s12works.tellAStory.assertion.validated
import com.s12works.tellAStory.assertion.enforcers.fail

@FromStandardLibrary
public val positive = validated(
    validationFailureMessage,
    ::fail,
    Range(0, null),
    ::isValid
)

@FromStandardLibrary
public val negative = validated(
    validationFailureMessage,
    ::fail,
    Range(null, 0),
    ::isValid
)
