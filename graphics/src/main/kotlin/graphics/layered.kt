package com.s12works.tellAStory.graphics

import com.s12works.tellAStory.graphics.sceneUtil.Object as SceneObject

public fun layered(objects: Collection<SceneObject>): SceneObject {
    var compilation: SceneObject = listOf()
    for (obj in objects) {
        compilation += obj
    }

    val positions = mutableListOf<Position>()
    val pixels = mutableListOf<Pixel>()
    for (pixel in compilation.reversed()) {
        if (!(pixel.position in positions)) {
            positions.add(pixel.position)
            pixels.add(pixel)
        } else {
            continue
        }
    }

    return pixels.toList()
}
