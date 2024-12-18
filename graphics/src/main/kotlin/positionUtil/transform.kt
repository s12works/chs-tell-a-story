package com.s12works.tellAStory.graphics.positionUtil

import com.s12works.tellAStory.graphics.Position
import com.s12works.tellAStory.graphics.Coordinate

public fun transform(
    position: Position,
    translator: com.s12works.tellAStory.graphics.positionUtil.coordTranslators.Translator
) = Position(translator(position.xpos), translator(position.ypos))

public fun transform(
    leftPosition: Position,
    rightPosition: Position,
    operator: InfixOperator
) = Position(
    operator(leftPosition.xpos, rightPosition.xpos),
    operator(leftPosition.ypos, rightPosition.ypos)
)
