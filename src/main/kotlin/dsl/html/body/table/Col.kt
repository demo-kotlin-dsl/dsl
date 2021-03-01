package com.mariuszdolata.dsl.html.body.table

import com.mariuszdolata.dsl.html.body.BodyTag

class Col : BodyTag("col") {
    var span: String
        get() = attributes["span"]!!
        set(value) {
            attributes["span"] = value
        }
    var style: String
        get() = attributes["style"]!!
        set(value) {
            attributes["style"] = value
        }
}