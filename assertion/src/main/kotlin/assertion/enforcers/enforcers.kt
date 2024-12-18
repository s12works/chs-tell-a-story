package com.s12works.tellAStory.assertion.enforcers

import com.s12works.tellAStory.assertion.Report

@FromStandardLibrary
public fun warn(report: Report) =
    println(
        "[${report.occurance.format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss"))}] WARNING: ${report}"
    )

@FromStandardLibrary
@Throws(FailureException::class)
public fun fail(report: Report): Nothing = throw FailureException(report)
