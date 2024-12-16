package com.s12works.tellAStory.graphics.rgb

import com.s12works.tellAStory.range.contains
import com.s12works.tellAStory.assertion.Assessment

public fun isValid(value: IndexValue): Assessment =
    value in range

public fun isValid(color: com.s12works.tellAStory.graphics.Color): Assessment = (
    isValid(color.red) &&
    isValid(color.green) &&
    isValid(color.blue)
)
