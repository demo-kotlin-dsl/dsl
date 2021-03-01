package com.mariuszdolata.dsl.html

interface Element {
    fun render(builder: StringBuilder, indent: String)
}