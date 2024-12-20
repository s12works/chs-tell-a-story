package com.s12works.tellAStory.assertion

/**
 * an action is performed via [enforcer] based on the potentially [com.s12works.tellAStory.assertion.Report] progided by [assessor]
 *
 * @param message represents the desired error-message (as [com.s12works.tellAStory.assertion.Message])
 * @param enforcer represents/serves as the desired [com.s12works.tellAStory.assertion.Enforcer] for handling the potential [com.s12works.tellAStory.assertion.Report] provided by [assessor]
 * @param assessor serves as the desired assessor used for determining whether or not a report is instantiated
 *
 * @return returns [Unit]; function intended to perform action via enforcer if necessary only
 */
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
