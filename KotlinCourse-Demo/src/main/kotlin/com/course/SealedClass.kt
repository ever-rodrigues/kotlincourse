package com.course

class SealedClass {
}

sealed class Mammal(val name:String)

class Cat(val catName:String):Mammal(catName)

class Human(val humanName:String, val job:String):Mammal(humanName)

fun greetMammal(mammal: Mammal):String{
    when(mammal){
        is Human-> return "Hello"
        is Cat -> return "Hello ${mammal.name}"
    }
}



fun main() {
    val cat=Cat("Snowny")
    println(cat.name)

}