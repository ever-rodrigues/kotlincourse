package com.course

class EqualsCodes {
}


fun main(){
    val authors = setOf("Eu", "voce","ele")
    val writers = setOf("Eu", "voce","ele")

    //Structure comparing
    println(authors==writers)

    //Reference comparing
    println(authors===writers)
}