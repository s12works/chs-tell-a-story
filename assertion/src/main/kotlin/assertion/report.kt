package com.s12works.tellAStory.assertion

public fun report(message: Message, assessor: () -> Assessment): Report? = when (assessor()) {
    false -> Report(Reciept(message, assessor), java.time.LocalDateTime.now())
    true -> null
}
