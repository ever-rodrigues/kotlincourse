
class Contact(val id:Int, var email:String)


fun main() {

    testPrinting("newTest")
    println(sumOfValues(10,20))
    printMessageWithPrefix("Teste","funcao")
    println(otherImplementationOfSameAbove("Testing return of Null on String Length"));

    val contact01 = Contact(1,"tombt@hotmail.com")

    //Setando um email novo na propriedade email
    contact01.email="newEmail@gmail.com"

    //Impressao do Id
    println(contact01.id)
    //Impressao do email
    println(contact01.email)


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

fun otherImplementationOfSameAbove(maybeString :String):String{
    if(maybeString!=null && maybeString.length>0){
        return "String '${maybeString}' with length of ${maybeString.length}"
    }
    else{
        return "Empty or null String"
    }
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

