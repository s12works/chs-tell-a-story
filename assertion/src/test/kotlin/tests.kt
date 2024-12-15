package com.s12works.tellAStory.test.assertion

import kotlin.test.Test
import kotlin.test.assertFails
import com.s12works.tellAStory.TestResult
import com.s12works.tellAStory.assertion.Reciept
import com.s12works.tellAStory.assertion.Assessment
import com.s12works.tellAStory.assertion.enforcers.fail as enfFail


public class AssertionTest: StandardLibEnforcerTest {
    private val placeholder: Placeholder = "AssertionTest"

    private val reciepts: Collection<Reciept> = com.s12works.tellAStory.getDynamicallyCreatedCollection<() -> Assessment, Reciept>(
        listOf(
            { 20 <= 10 },
            { 1 > 3 },
            { "I" in "Hello" }
        ),
        { Reciept(this.placeholder, it) }
    )

    // eventually remaster warning framework and implement
    @Test
    override fun warn(): TestResult {}

    @Test
    override fun fail(): TestResult = this.reciepts.forEach {
        assertFails {
            com.s12works.tellAStory.assertion.assert(
                it.message,
                ::enfFail,
                it.assessor
            )
        }
    }       
}


public class ValidationTest: StandardLibEnforcerTest {
    private val placeholder: Placeholder = "ValidationTest"

    private val sampleConfig = ValidationTestSampleConfig<Int>(
        listOf(
            10,
            100,
            1000
        ),
        
        listOf(
            { obj: Int -> obj == 5 },
            { obj: Int -> obj == 0 },
            { obj: Int -> obj < 0 }
        )
    )

    @Test
    override fun warn(): TestResult {}

    @Test
    override fun fail(): TestResult {
        for (assessor in this.sampleConfig.assessors) {
            for (obj in this.sampleConfig.objects) {
                assertFails {
                    com.s12works.tellAStory.assertion.validated(
                        this.placeholder,
                        ::enfFail,
                        obj,
                        assessor
                    )
                }
            }
        }
    }
}
