package com.s12works.tellAStory.assertion

/**
 * defined as the "handler" that conducts the desired action(s) for a [com.s12works.tellAStory.assertion.Report]
 *
 * @param O represents type of object provided by [Enforcer]
 */
public typealias Enforcer<O> = (Report) -> O
