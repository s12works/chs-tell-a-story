package com.s12works.tellAStory.graphics.positionUtil.operators

import com.s12works.tellAStory.graphics.Coordinate

@FromStandardLibrary
public val plus: Operator = { coord1: Coordinate, coord2: Coordinate -> coord1 + coord2 }

@FromStandardLibrary
public val minus: Operator = { coord1: Coordinate, coord2: Coordinate -> coord1 - coord2 }

@FromStandardLibrary
public val times: Operator = { coord1: Coordinate, coord2: Coordinate -> coord1 * coord2 }
