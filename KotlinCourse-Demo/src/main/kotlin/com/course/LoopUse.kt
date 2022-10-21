package com.course

class LoopUse {

}

fun main() {

    val myTeste= teste()

    val cakes= listOf("carrot","cheese","cholocalte")
    for(cake in cakes){
        println(cake)
    }

    var cakeBaked =0
    var cakeEaten=0
while(cakeEaten<5){
    eatCake()
    cakeEaten++
}
    do{
        cakeBaked++
    }while (cakeEaten>cakeBaked)
}

fun eatCake(){
    println("Eating a cake")
}


fun teste(){
    var teste=0
    do{
        teste++
        println("teste")
    }
    while(teste<5)
}


//Iterators


