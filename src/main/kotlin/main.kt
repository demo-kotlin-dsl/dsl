package com.mariuszdolata

import com.mariuszdolata.dsl.html.HTML;
import java.io.File

fun main(args: Array<String>) {
    var html: HTML = dslHtml()
    var fileName: String = "table.html"
    File(fileName).writeText(html.toString())
    println(html)
}

fun dslHtml(): HTML {
    var result = html{
        head{
            title{
                +"DSL demo"
            }
        }
        body{
            h1{
                b{
                    +"Sample table with content"
                }
            }
            table {
                caption {
                    b{
                        i{
                            +"My favourite main characters"
                        }
                    }
                }
                colgroup {
                    col(style="background-color:#99ff99", span="1"){
                    }
                    col(style="background-color:#80bfff", span="1"){
                    }
                }
                thead{
                    tr{
                        th{
                            +"First Name"
                        }
                        th{
                            +"Last Name"
                        }
                    }
                }
                tbody{
                    tr{
                        td{
                            +"Jason"
                        }
                        td{
                            +"Bourne"
                        }
                    }
                    tr{
                        td{
                            +"Thomas"
                        }
                        td{
                            +"Anderson"
                        }
                    }
                }
                tfood{
                    tr{
                        td{
                            +"count:"
                        }
                        td{
                            +"2"
                        }
                    }
                }
            }
        }
    }
    return result
}


fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()
    html.init()
    return html
}