package com.s12works.tellAStory.graphics.boundingBoxPositioning

import com.s12works.tellAStory.assertion.enforcers.warn
import com.s12works.tellAStory.range.contains

public fun validated(percentage: Percentage) = com.s12works.tellAStory.assertion.validated(
    "percentage ($percentage) is not within bounds specified by range",
    ::warn,
    percentage,
    { it in range }
)
