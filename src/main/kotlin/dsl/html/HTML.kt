package com.mariuszdolata.dsl.html

import com.mariuszdolata.dsl.html.body.Body
import com.mariuszdolata.dsl.html.head.Head

class HTML : TagWithText("html") {
    fun head(init: Head.() -> Unit) = initTag(Head(), init)
    fun body(init: Body.() -> Unit) = initTag(Body(), init)
}