package com.s12works.tellAStory.graphics

public fun boundingBoxOf(space: Space): BoundingBox {
    lateinit var corner1: Position
    lateinit var corner2: Position
    
    var iteration: Int = 1
    for (position in space) {
        if (iteration == 1) {
            corner1 = position
            corner2 = position
        } else {
            if (position.xpos < corner1.xpos) { corner1 = Position(position.xpos, corner1.ypos) }
            if (position.ypos < corner1.ypos) { corner1 = Position(corner1.xpos, position.ypos) }
            
            if (position.xpos > corner2.xpos) { corner2 = Position(position.xpos, corner2.ypos) }
            if (position.ypos > corner2.ypos) { corner2 = Position(corner2.xpos, position.ypos) }
        }
        
        iteration++
    }

    return BoundingBox(corner1, corner2)
}
