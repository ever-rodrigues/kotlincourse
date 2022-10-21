# kotlincourse
All files from Kotlin Course

Just some anottation about this subject!


->Kotlin 
	-> fun -> 	function (method)
	Obs:At end of the func you need to specify the Type of return of this function, as exemplo " :String "

		fun printSomething(message : String) :String {
			return message
		}
	
 	-> main() -> 	Public Static void Main(String [] args) 
 	
 	
 	
 	
	 -> vararg -> quantidade indefinida de elementos do mesmo tipo
	->Flexibilidade de n de elementos passados como argumentos no parametro da funcao (sera passado como um array)

		fun printAll(vararg messages:String){
 			for(m in messages){
 				println(m)
 			}
 		}
 		
 		fun printAll(vararg messages:String, prefix:String){
 			for(m in messages){
 				println(m)
 			}
 		}
 		
 		
 		
 		Obs:
		Se voce quiser usar os valores do varags  voce pode usar a declaracao normal
		Se voce quiser usar o varargs como uma "variavel" voce deve usar o "*"  -> exemplo: *nomeVariavel 
		
		
	->Variaveis
		
		Explora  muito a inferencia de tipo
		var => Mutavel
		val => Inmutavel	
	
	var a :String ="inicial"
	println(a)
	
	val b:Int =1
	val c= 3
	
	
		Toda Variavel precisa ser inicializada ao longo do codigo , para que comandos como print devam ser executados. 
		
		Exemplo de erro abaixo:
			var e:Int 
			println(e)
		
	
		
		
	->Null Safety
	
		->para declarar variavel que aceita valor nulo , devemos usar "?"
		ex:
			var nullable :String?="You can keep a nulla here:
			nullable=null
			
			
		ex2:
		
		var nullable :Srting?
		nullable=null
		
		var notNullable :String
		notNullable="Test"
		
		
		fun strLength(str :String?):Int{
			return str?.length ?:0 // -> Here if the return of variable is null the return value will be "0"
		} 	
		
		println(strLength(nullable))
		println(strLength(notNullable))
		
		
		
	->Classes
		-> Class
		
		ex:
		Class Contact (val id: Int, var email:String)
		
		fun main(){
		val contact = Contatct(1,"tombt@hotmail.com")
		println(contact.id)
		contact.email="teste@gmail.com"
		
		
		
		
		}
		

 	->Generics
 		Its normaly used in Collections (Lists)  -> The same of Java you can use any letter to describe a diamond operator that you 
 		are using Generics
 		
 		->Ex:
 		package com.course

		class ExampleGenerics<T> (vararg items:T){
		    private val elements = items.toMutableList()

		    fun push(element: T) = elements.add(element)
    		    fun peek():T = elements.last()
		    fun pop():T = elements.removeAt(elements.size-1)


		    //Metodo de override que imprime os itens da lista usando o ToString()
		    override fun toString(): String {
	            return "Muttable Stack(${elements.joinToString()})"
    		}

}

fun main(){
    val stack = ExampleGenerics("Teste","Teste1")
    stack.push("NewElement")
    println(stack)
}
 		
 		
 		
 	->Controle de Fluxo
 		->When ( Similar to switch case in others languages)
 		Ex:
 		//When is similar with switch-case but more flexible than switch-case
 	
		fun cases (obj:Any){
		    when(obj){
        		1-> println("One")
        		is Long-> println("Long")
        		!is  String -> println("Not a String")
        		else -> println("Unknown")
    }
}
		
		
		Use of When at "expressions"
		
		eX:
		fun whenAssign(obj:Any):Any{
		    val result= when(obj){
        		1->"One"
        		is Long -> false
        		else ->42
    			}
    			return result
		}	
		
		 		
 		->Loops
 		
 		fun main() {
		    val cakes= listOf("carrot","cheese","cholocalte")
		    for(cake in cakes){
		        println(cake)
		    }
		}
 		
 		
 		
 		->Ranges
 		
 		->Verificacoes de Igualdade
 		
 		->Expressoes Condicionais
 		
 	->Collections
 	
 		->List
 		
 		->Maps
 		
 		
 		
 		
 		
