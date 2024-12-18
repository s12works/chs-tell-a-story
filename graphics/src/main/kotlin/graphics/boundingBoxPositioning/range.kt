package com.s12works.tellAStory.graphics.boundingBoxPositioning

import com.s12works.tellAStory.assertion.enforcers.fail
import com.s12works.tellAStory.range.isValid

public val range = com.s12works.tellAStory.assertion.validated(
    "com.s12works.tellAStory.graphics.boundingBoxPositioning.range Range validation failed",
    ::fail,
    com.s12works.tellAStory.range.Range(0, 100),
    ::isValid
)
