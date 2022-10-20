package com.course

class ExampleGenerics<T> (vararg items:T){
    private val elements = items.toMutableList()

    fun push(element: T) = elements.add(element)
    fun peek():T = elements.last()
    fun pop():T = elements.removeAt(elements.size-1)
    fun size():Int=elements.size;

    //Metodo de override que imprime os itens da lista usando o ToString()
    override fun toString(): String {
        return "Muttable Stack(${elements.joinToString()})"
    }

}

fun main(){
    val stack = ExampleGenerics("Teste","Teste1")
    stack.push("NewElement")
    println(stack)

    for(i in 1..stack.size()){
        println("pop(): ${stack.pop()}")
        println(stack)

    }
}
