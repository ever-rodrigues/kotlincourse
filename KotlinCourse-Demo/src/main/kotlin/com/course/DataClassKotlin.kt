package com.course

class DataClassKotlin {


}

fun main() {
 val user = User("Everton",1)
    println(user)
}

data class User(val name:String, val id:Int){
    override fun equals(other:Any?)=
        other is User && other.id==this.id
}