package com.poo

class heritage {

}

fun main() {
    var contador:Int =0
    for(valorFixo in 0..7){
        if(valorFixo % 1==0){
            println("VALOR ATUAL -> $valorFixo")
            contador++
            println("Valor adicionado")
        }

    }
    contador--
    println("Total de valores divisiveis por 3 $contador")

    println("/////////////////////////////////////////////////////////////////////////////////////////////")


    val numeroFixo:Int =6
    var meuContador:Int =0
    var meuContador66:Int=0
    var meuContador666:Int=0

    val numeroFinal =1536
    for(i in 0..numeroFinal){
        val stringNumber:String =i.toString()
        if(stringNumber.contains("6")){
            println("Atual $stringNumber")
            meuContador++
        }
        if(stringNumber.contains("66")){
            println("Atual $stringNumber")
            meuContador66++
        }
        if(stringNumber.contains("666")){
            println("Atual $stringNumber")
            meuContador666++
        }
    }
    println("Numeros entre 0 e $numeroFinal :")
    println(meuContador)
    println(meuContador66)
    println(meuContador666)


    println("/////////////////////////////////////////////////////////////////////////////////////////////")


    //10 Jogam em casa 10 fora de casa.
    //Totalizando 20 times.

    var n:Int =567
    //38 Rodadas, pois 1 time nao joga consigo memso, ou seja 20-1= 19*2 (Dois jogos, um em casa e outro fora de casa) = 38


    var produto:Int = n*(n-1)
    println("Total de jogos de um numero n de times em um campeonato")
    println(produto)


    println("/////////////////////////////////////////////////////////////////////////////////////////////")

    println("ACHE O PROXIMO :")
    //10 , 37 , 82 , 145 , 226
//   ,    ,

//3² + 1 = 9 + 1 = 10
//6² + 1 = 36 + 1 = 37
//9² + 1 = 81 + 1 = 82
//12² + 1 = 144 + 1 = 145
//15² + 1 = 225 + 1 = 226
//18² + 1 = 324 + 1 = 325

//Tabuada de 3 + 1;

    val tabuada=3
    var numeroAtual:Int=3
    var incremento:Int =1
    for(i in 0..10){
        numeroAtual=tabuada*incremento
        var calc:Int= (numeroAtual*numeroAtual)+1;
        println("Numero da cadeis:$calc")
        incremento++
    }



//
//    var bolasAzuis:Int = 0
//    var bolasVermelhas:Int = 0
//
//    var diaAtualAzul=(bolasAzuis +2)
//    var diaAtualVermelho=(bolasVermelhas-3)
//    var numeroDia:Int =1
//    var totalAzuis=numeroDia *(bolasAzuis)
//    var totalVermelhas=numeroDia *(bolasVermelhas)



//      (2+A) <-> (V-3)
//      5D = 2+A
//      5D = V-3
//      9D = A = V*2

    //atualA=a+2
    //atualB=b-3

    //  1D -> A? 20 -> V?40
    //  2D -> A+    2   -> V-3
    //  3D -> A +   4   -> v-6
    //  4D -> A +   6   -> V-9
    //  5D -> A +   8   -> v-12
    //  5D->    28 -> 28

    //  A+8 = V-12  => A+8+12 = V
    //  A+20=V
    //A +20 = 2* A
    //2A = A + 20
    // A =20
    // V = 40
    //  6D -> A +   10  -> V-15
    //  8D -> A +   12  -> V-18
    //  9D -> A +   14  ->  V-21
    // 9D -> 2* A = V
    // V = 40   A=20



    println("/////////////////////////////////////////////////////////////////////////////////////////////")


    //total pontos =28 /3
    //  8 -> Vitorias  = 24 pontos
    // 4 Empate ->
    //total partidas =19 -> 57 pontos maximo do campeonado
    //



    println("/////////////////////////////////////////////////////////////////////////////////////////////")

    //  4 Digitos -> 0 a 9 (10 possibilidades)
    // 1-5 -7 ->
    //    3x3x3 - 0
    //      1,5,7 <->1,5,7 <=> 1,5,7 <->0

    //

    println("/////////////////////////////////////////////////////////////////////////////////////////////")

//bacteria
    //duplica a cada minutos ( total = 2* bacteria*minuto)
    //2*2=4
    //4*4=16
    //16*16=32
    // Depois de 13 minutos placa pela metade
    // Duplicando uma metade = inteiro ( ou seja 1 minuto depois que ela alcancou a metade ela fecha a placa toda.



    println("/////////////////////////////////////////////////////////////////////////////////////////////")

    //quadrados no tabuleiro
    // 1 a  100
    //  Azul    -> Vermelho     -> Vermelho     ->Verde         -> Verde    -> Verde    -> Azul     -> Vermelho -> Vermelho     -> Verde    ->
    //  Verde   -> Verde        ->Azul          -> Vermelho     ->Vermelho  ->Verde     -> Verde    -> Verde    -> Azul         -> Vermelho ->

    println("/////////////////////////////////////////////////////////////////////////////////////////////")




    println("/////////////////////////////////////////////////////////////////////////////////////////////")


//6,    12      36
// 3,      9,      33
//En este caso tenemos la siguiente secuencia o serie numérica:
//
//6, 3, 12, 9, 36, 33...
//La misma tiene el siguiente comportamiento:
//
//a₁ = 6
//a₂ = 6 - 3 = 3
//a₃ = 3·4 = 12
//a₄ = 12 - 3 = 9
//a₅ = 9·4 = 36
//a₆ = 36 - 3 = 33
}

//Numeros entre 0 e 60 que possuem 6
//6
//16
//26
//36
//46
//56
//60

