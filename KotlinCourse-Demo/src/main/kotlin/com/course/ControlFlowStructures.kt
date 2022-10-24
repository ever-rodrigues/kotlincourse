package com.course

class ControlFlowStructures {

}

fun main() {
    println("Control Flow code example")
    cases("Hello")
    cases(1)
    cases(10L)
    cases(ControlFlowStructures())
    testTernario(4)
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




//ternario em Kotlin
fun testTernario(valora: Int) {
    val result =if (valora >=7) "aprovado" else if(valora >=5 && valora <7) "recuperacao" else "reprovado"
    println("Resultado e : $result")
}

/*..
//Se fosse em Java
public void usandoTernarion(int valorA ){
    String resultado = valorA<=12 ? "verdade" : "falso";
    System.out.println("Valor e de "+ resultado);
}
 * */








