package com.s12works.tellAStory.graphics.colorUtil

import com.s12works.tellAStory.range.contains

public fun isValid(value: IndexValue): com.s12works.tellAStory.assertion.Assessment =
    value in range
