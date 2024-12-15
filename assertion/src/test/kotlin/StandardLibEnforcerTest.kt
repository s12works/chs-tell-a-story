package com.s12works.tellAStory.test.assertion

import com.s12works.tellAStory.TestResult

public interface StandardLibEnforcerTest {
    public fun warn(): TestResult

    public fun fail(): TestResult
}
