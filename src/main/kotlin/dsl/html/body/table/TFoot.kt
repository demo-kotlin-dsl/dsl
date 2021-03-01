package com.mariuszdolata.dsl.html.body.table

import com.mariuszdolata.dsl.html.body.BodyTag

class TFoot : BodyTag("tfoot") {
    fun tr(init: TR.() -> Unit) = initTag(TR(), init)
}