package com.s12works.tellAStory.graphics.positionUtil.kotlinOperatorSyntax

import com.s12works.tellAStory.graphics.Position
import com.s12works.tellAStory.graphics.positionUtil.transform

operator fun Position.plus(other: Position): Position = transform(
    this,
    other,
    com.s12works.tellAStory.graphics.positionUtil.operators.plus
)

operator fun Position.minus(other: Position): Position = transform(
    this,
    other,
    com.s12works.tellAStory.graphics.positionUtil.operators.minus
)

operator fun Position.times(other: Position): Position = transform(
    this,
    other,
    com.s12works.tellAStory.graphics.positionUtil.operators.times
)
