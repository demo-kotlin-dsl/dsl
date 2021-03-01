package com.mariuszdolata.dsl.html.body

import com.mariuszdolata.dsl.html.TagWithText
import com.mariuszdolata.dsl.html.body.table.*
import org.jetbrains.annotations.NotNull
import kotlin.jvm.JvmStatic



abstract class BodyTag(name: String) : TagWithText(name) {
    fun b(init: B.() -> Unit) = initTag(B(), init)
    fun p(init: P.() -> Unit) = initTag(P(), init)
    fun h1(init: H1.() -> Unit) = initTag(H1(), init)
    fun a(href: String, init: A.() -> Unit) {
        val a = initTag(A(), init)
        a.href = href
    }
    fun table(init: Table.() -> Unit) = initTag(Table(), init)
    fun i(init: I.() -> Unit) = initTag(I(), init)
}


