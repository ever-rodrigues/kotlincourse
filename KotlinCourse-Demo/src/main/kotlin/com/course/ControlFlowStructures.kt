package com.course

class ControlFlowStructures {

}

fun main() {
    println("Control Flow code example")
    cases("Hello")
    cases(1)
    cases(10L)
    cases(ControlFlowStructures())
}

//When is similar with switch-case but more flexible than switch-case
fun cases (obj:Any){
    when(obj) {
        1 -> println("One")
        "Hello " -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown")
        //else is like default in switch case Java, else is optional
    }


}

//Using When like a xpression
fun whenAssign(obj:Any):Any{
    val result= when(obj){
        1->"One"
        is Long -> false
        else ->42
    }
    return result
}









