# kotlincourse
All files from Kotlin Course

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
		
		
		

 		
