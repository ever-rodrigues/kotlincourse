package com.course


//Para usar heranca devemos usar o open
open class Dog {
    open fun sayHello(){
        println("Say hello !")
    }
}


class Yorkshire:Dog(){
    override fun sayHello() {
        println("Agora usando heranca")
    }
}


open class Tiger (val origin :String){
    fun sayHello(){
        println("A tiger from $origin")
    }
}


class MyTiger:Tiger("Brazil")


open class Lion(val name:String, val origin:String){
    fun sayHello(){
        println("$name says hello from $origin")
    }
}


class Asiatic(name:String) :Lion(name=name, origin = "India")


fun main() {
    val myDog :Dog = Yorkshire()
    myDog.sayHello()

    val myTiger:Tiger=MyTiger()
    myTiger.sayHello()

    val myLion:Lion=Asiatic("Robert")
    myLion.sayHello()
}

