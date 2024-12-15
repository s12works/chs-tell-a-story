package com.s12works.tellAStory.objectRepresentation

public fun <O: Any> getStandardRepr(obj: O): Translation =
    com.s12works.tellAStory.objectRepresentation.translators.standard(
        com.s12works.tellAStory.objectRepresentation.representors.standard(
            obj
        )
    )
