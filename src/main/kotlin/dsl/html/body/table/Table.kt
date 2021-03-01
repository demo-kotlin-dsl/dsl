package com.mariuszdolata.dsl.html.body.table

import com.mariuszdolata.dsl.html.body.BodyTag

class Table : BodyTag("table") {
    fun thead(init: THead.() -> Unit) = initTag(THead(), init)
    fun tbody(init: TBody.() -> Unit) = initTag(TBody(), init)
    fun tfood(init: TFoot.() -> Unit) = initTag(TFoot(), init)
    fun tr(init: TR.() -> Unit) = initTag(TR(), init)
    fun caption(init: Caption.() -> Unit) = initTag(Caption(), init)
    fun colgroup(init: ColGroup.() -> Unit) = initTag(ColGroup(), init)

}