package com.s12works.tellAStory.graphics

public fun rotationOf(position: Position) = Position(-position.ypos, -position.xpos)

// TODO: potentially make recursive
public fun rotationOf(position: Position, iterations: Int): Position {
    var rotatedPosition = position

    for (i in 0..iterations) {
        rotatedPosition = rotationOf(rotatedPosition)
    }

    return rotatedPosition
}
