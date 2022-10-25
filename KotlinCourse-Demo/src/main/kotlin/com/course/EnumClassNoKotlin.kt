package com.course

enum class EnumClassNoKotlin {
    IDLE,RUNNING,FINISHED
}

fun main(){
    val state = EnumClassNoKotlin.RUNNING
    val message= when(state){
        EnumClassNoKotlin.IDLE->"Its idle"
        EnumClassNoKotlin.RUNNING->"Its running"
        EnumClassNoKotlin.FINISHED->"Its finished"

    }
    println(message)
}