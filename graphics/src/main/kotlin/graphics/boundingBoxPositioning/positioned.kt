package com.s12works.tellAStory.graphics.boundingBoxPositioning

import com.s12works.tellAStory.graphics.sceneUtil.Object as SceneObject
import com.s12works.tellAStory.getDynamicallyCreatedCollection as configuredVia
import com.s12works.tellAStory.graphics.Position
import kotlin.math.abs as absoluteValueOf

public fun positioned(
    sceneObject: SceneObject,
    config: Configuration
): SceneObject {
    val boundingBox: com.s12works.tellAStory.graphics.BoundingBox =
        com.s12works.tellAStory.graphics.boundingBoxOf(
            configuredVia(sceneObject) {
                it.position
            }
        )

    return configuredVia(sceneObject) {
        com.s12works.tellAStory.graphics.Pixel(
            com.s12works.tellAStory.graphics.Position(
                ((config.width.toFloat() / 100f) * com.s12works.tellAStory.graphics.rectUtil.width(boundingBox)).toInt(),
                ((config.height.toFloat() / 100f) * com.s12works.tellAStory.graphics.rectUtil.height(boundingBox)).toInt()
            ),
            it.color
        )
    }
}
