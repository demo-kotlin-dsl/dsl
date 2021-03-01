package com.mariuszdolata.dsl.html.body.table

import com.mariuszdolata.dsl.html.body.BodyTag

class TR : BodyTag("tr") {
    fun th(init: TH.() -> Unit) = initTag(TH(), init)
    fun td(init: TD.() -> Unit) = initTag(TD(), init)
}