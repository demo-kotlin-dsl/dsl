package com.mariuszdolata.dsl.html.body.table

import com.mariuszdolata.dsl.html.body.BodyTag

class TBody : BodyTag("tbody") {
    fun tr(init: TR.() -> Unit) = initTag(TR(), init)
}