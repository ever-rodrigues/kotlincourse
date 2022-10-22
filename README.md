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
 			->FOR
 		fun main() {
		    val cakes= listOf("carrot","cheese","cholocalte")
		    for(cake in cakes){
		        println(cake)
		    }
		}
 		
 			->WHILE / DO WHILE
 			
 			    var cakeBaked =0
			    var cakeEaten=0 
				while(cakeEaten<5){
				    eatCake()
				    cakeEaten++
				}
    				do{
			        cakeBaked++
				    }while (cakeEaten>cakeBaked)
				}

 		
 			->Iterators
 			
 			class Animal (val name:String){
			}	
			class Zoo(val animals: List<Animal>){
			    operator fun iterator():Iterator<Animal>{
        			return animals.iterator()
    				}
			}


			fun main(){
			    val animals = listOf(Animal("Zebra"),Animal("Lion"))
			    val zoo= Zoo(animals)
			    for(animal in zoo){
			        println("Watch out , its a ${animal.name}")
			    }
			}



 		
 		->Ranges ( until , step, downTo ...)
 		 			
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
	


 ->Verificacoes de Igualdade
 
 		fun main(){
    		val authors = setOf("Eu", "voce","ele")
    		val writers = setOf("Eu", "voce","ele")

   		 //Structure comparing
    		println(authors==writers)

   		 //Relacional comparing
    		println(authors===writers)
		}
 
 
 		
 		->Expressoes Condicionais (If Ternario)
 		
 		fun main() {
		    fun max(a:Int , b:Int)= if(a>b) a else b
			    println(max(99,-42))

		    fun maxOld(a:Int , b:Int):Int{
		        if(a>b){
		            return a
		        }else{
		        return b
		        }
		    }
		    println(maxOld(100,-45))

			}
 		
 	->Collections
 	
 		->List
 			->MutableList
 				->CRUD of List
 			->ImutableList
 				->Only READ of elements from a list
 		
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
            			i-> println("Some useful info on user $i")
       				 }
        			//getSysSudoers().add(5)<-Error!
	}
 	
 		->Maps
 		
 		
 		->Funcoes Uteis
 		
 		
 		val numbers = listOf(1,-2,3,-4,5,-6)
 		
 		val positives = numbers.filter{x->x>0}
 		val negatives = numbers.filter{it<0}
 		
 		println("Numbers : $numbers")
 		println("Positive Numbers : $positives")
 		println("Negatives : $negatives")
 		
 		
 		//Uso para multiplicar todos os elementos por 2
 		val doubled = numbers.map{x->x*2}
 		
 		
 		
 		
 			->Map ( Junta as duas estruturas respeitando a lista (intacta) 
 			->Flat Map ( Faz um merge dos dados numa mesma estrutura de dados (UNIFICA TUDO))
 			
 		
 		
 		
 		
 		
