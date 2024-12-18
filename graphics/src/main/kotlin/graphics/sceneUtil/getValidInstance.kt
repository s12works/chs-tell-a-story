package com.s12works.tellAStory.graphics.sceneUtil

import com.s12works.tellAStory.graphics.layered
import com.s12works.tellAStory.getDynamicallyCreatedCollection as configuredVia
import com.s12works.tellAStory.graphics.Pixel

public fun getValidatedInstance(config: Configuration): Instance {
    val composition: com.s12works.tellAStory.graphics.Scene = layered(
        listOf(
            configuredVia<com.s12works.tellAStory.graphics.Position, Pixel>(config.window.space) {
                Pixel(it, config.background)
            },
            layered(config.objects)
        )
    )

    val validPixels = mutableListOf<Pixel>()
    for (pixel in composition) {
        if (pixel.position in config.window.space.iterator().asSequence().toList()) {
            validPixels.add(pixel)
        }
    }

    return validPixels.toList()
}
