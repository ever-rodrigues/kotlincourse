package com.course

class Lists {


}

fun main() {
    val systemUsers:MutableList<Int> = mutableListOf(1,3,5)
    val sudoers:List<Int> = systemUsers

    fun addSystemUser(newUser:Int){
        systemUsers.add(newUser)
    }

    fun getSysSudores():List<Int>{
        return sudoers
    }

        addSystemUser(4)
        println("Tot sudoers : ${getSysSudores().size}")
        getSysSudores().forEach {
            i->
            println("Some useful info on user $i")
        }
        //getSysSudoers().add(5)<-Error!
}