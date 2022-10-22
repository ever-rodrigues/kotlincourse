package com.course

class CondicionalExample {

}

fun main() {
    fun max(a:Int , b:Int)= if(a>b) a else b
    println(max(99,-42))

    fun maxOld(a:Int , b:Int):Int{
        if(a>b){
            return a
        }
        return b
    }


    println(maxOld(100,-45))

}