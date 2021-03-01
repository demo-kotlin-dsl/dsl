package com.mariuszdolata.dsl.html.head

import com.mariuszdolata.dsl.html.TagWithText

class Head : TagWithText("head") {
    fun title(init: Title.() -> Unit) = initTag(Title(), init)
}