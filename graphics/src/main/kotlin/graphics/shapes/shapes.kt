package com.s12works.tellAStory.graphics.shapes

import com.s12works.tellAStory.mathSquareOf
import com.s12works.tellAStory.graphics.Shape
import com.s12works.tellAStory.graphics.Position
import com.s12works.tellAStory.objectRepresentation.Translation as Representation
import com.s12works.tellAStory.objectRepresentation.getStandardRepr
import com.s12works.tellAStory.graphics.positionUtil.kotlinOperatorSyntax.minus
import com.s12works.tellAStory.graphics.positionUtil.kotlinOperatorSyntax.plus
import com.s12works.tellAStory.graphics.Space

// transition to representing rectangles with infinite lengths
@FromStandardLibrary
public data class Rectangle(
    public val corner1: Position,
    public val corner2: Position
): Shape {
    override fun toString(): Representation =
        getStandardRepr(this)

    override val space = object: Space {
        private val positions = mutableListOf<Position>()

        init {
            for (column in this@Rectangle.corner1.ypos..this@Rectangle.corner2.ypos) {
                for (row in this@Rectangle.corner1.xpos..this@Rectangle.corner2.xpos) {
                    this.positions.add(
                        Position(row, column)
                    )
                }
            }
        }

        override fun iterator() = this.positions.iterator()
    }
}

// TODO: potentially remove/deprecate
@FromStandardLibrary
public data class Square(
    public val corner: Position,
    public val length: Int
): Shape {
    override fun toString(): Representation =
        getStandardRepr(this)

    override val space = Rectangle(
        this.corner,
        this.corner + Position(this.length, this.length)
    ).space
}

@FromStandardLibrary
public data class Circle(
    public val radius: com.s12works.tellAStory.graphics.Radius,
    public val origin: Position
): Shape {
    override fun toString(): Representation =
        getStandardRepr(this)

    override val space = object: Space {
        private val enclosure: Space = Square(this@Circle.origin - Position(this@Circle.radius, this@Circle.radius), this@Circle.radius).space
        private val positions = mutableListOf<Position>()

        init {
            for (position in this.enclosure) {
                // uses distance formula for calculation
                if (kotlin.math.sqrt((mathSquareOf(position.xpos - this@Circle.origin.xpos) + mathSquareOf(position.ypos - this@Circle.origin.ypos)).toDouble()) <= this@Circle.radius) {
                    this.positions.add(position)
                } else {}
            }
        }

        override fun iterator() = this.positions.iterator()
    }
}
