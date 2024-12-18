package com.s12works.tellAStory.assertion

public fun assert(
    message: Message,
    enforcer: Enforcer<*>,
    assessor: () -> Assessment
): Unit {
    val report: Report? = report(message, assessor)

    when (report != null) {
        true -> enforcer(report)
        false -> Unit
    }
}
