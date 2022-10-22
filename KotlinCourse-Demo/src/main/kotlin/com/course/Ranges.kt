package com.course

class Ranges {
}

fun main(){
    for(i in 0..3){
        println("counting $i")
    }


    for(i in 0 until 3){
        println("Until $i")
    }

    for(i in 2..8 step 2){
        println("Step of 2 $i")
    }

    for(i in 3 downTo 0){
        println("Decrementing $i")
    }


    //Ranges with Char
    //c -> character

    for(c in 'a'..'d'){
        println("Range $c")
    }

    val x=2
    if(x in 1..10){
        println("${x} is in range from 1 to 5")
    }

    if(x !in 5..10){
        println("${x} is not in range from 5 to 10")
    }




}


