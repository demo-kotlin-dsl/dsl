package com.mariuszdolata.dsl.html.body.table

import com.mariuszdolata.dsl.html.body.BodyTag

class ColGroup : BodyTag("colgroup") {
    fun col(style: String,span: String, init: Col.() -> Unit) {
        val col = initTag(Col(), init)
        col.style = style
        col.span = span
    }
}