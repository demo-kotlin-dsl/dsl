package com.mariuszdolata.dsl.html.body.table

import com.mariuszdolata.dsl.html.body.BodyTag

class THead : BodyTag("thead") {
    fun tr(init: TR.() -> Unit) = initTag(TR(), init)
}