package com.course

class UsginObject {

}

fun rentPrice(standartDays:Int, specialDays:Int):Unit{
    val dayRates=object{
        var standart:Int = 30*standartDays
        val special:Int=45*specialDays
    }

    val total = dayRates.standart+ dayRates.special
    println(total)
}

fun main() {
    rentPrice(10,2)

}
