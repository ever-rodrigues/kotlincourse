fun main() {
    testPrinting("newTest")
    println(sumOfValues(10,20))
    printMessageWithPrefix("Teste","funcao")



    //Var -> Mutavel
    //Val -> Imutavel


    var nullable :String?
    nullable=null

    var notNullable :String
    notNullable="Test"


    fun strLength(str :String?):Int{
        return str?.length ?:0 //Aqui se o retorno dessa variavel venha nulo, o retorno para esse operacao sera 0
    }

    println("Sizeof nullable string -> "+strLength(nullable))
    println("Size of notNullable String->"+ strLength(notNullable))

}


//return of function it will be "like void" but at kotlin is named as Unit
fun testPrinting(myMessage: String ):Unit{
    println(myMessage)
}


fun sumOfValues(valueA:Int, valueB:Int):Int{
    return valueA+valueB
}

fun multiply(valueA:Int , valueB:Int)=valueA*valueB

fun printMessageWithPrefix(prefix:String="Prefix", message:String ){
    println("$prefix $message")
}



