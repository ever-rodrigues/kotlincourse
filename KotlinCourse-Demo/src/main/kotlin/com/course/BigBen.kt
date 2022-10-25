package com.course

//Companion like Abstract Class and Method in Java
class BigBen {
    companion object Bonger{
        fun getBongs(nTimes:Int){
            for(i in 1..nTimes){
                println("BONG")
            }
        }
    }
}

fun main() {
    BigBen.getBongs(10)
}