fun main() {
    testPrinting("newTest")
    println(sumOfValues(10,20))
}


//return of function it will be "like void" but at kotlin is named as Unit
fun testPrinting(myMessage: String ):Unit{
    println(myMessage)
}


fun sumOfValues(valueA:Int, valueB:Int):Int{
    return valueA+valueB
}
