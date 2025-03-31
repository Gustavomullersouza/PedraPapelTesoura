fun main() {
    do {
        println("1-JOGAR")
        println("2-PLACAR")
        println("3-SAIR")

        val opcao = readLine()!! // USUARIO DIGITA A OPÇÃO

        when (opcao.toInt()) {
            1 -> jogar() // A SETINHA SE CHAMA LAMBDA79
            2 -> println("placar")
            3 -> println("saindo...")

        }
    }while (opcao != "0")
}

fun jogar() {
    println("Digite seu nickname: ")
    val nickname = readLine() // USUARIO DIGITA SEU NICK

    println("QUE OS JOGOS COMEÇEM!")
    var rodadas = 1
    do {
        println("O que você quer jogar? ")
        println("Pedra,Papel ou Tesoura")
        var jogada = readln().uppercase() //Movimento do Jogador

        //instância dos elementos do jogo
        var pedra = Pedra()
        var tesoura = Tesoura()
        var papel = Papel()

        var movimentoPC = computador()// movimento do PC
        when(jogada){
            "PEDRA" ->{
                pedra.luta(movimentoPC)
            }
            "PAPEL" ->{
                papel.luta(movimentoPC)
            }
            "TESOURA" ->{
                tesoura.luta(movimentoPC)
            }
        }

        rodadas ++ // no final da rodada incrmenta
    }while (rodadas <= 3)
}

fun computador(): String {
    /**
     * Aqui temos um RANGE que é determinado por (1..3)
     * um range é um intervalo númeirco, neste caso de 1 a 3
     * a função .random ira gerar um número aleatório  dentro
     * desse intervalo que determinamos*/
    val movimento = (1..3).random()
    when (movimento) {
        1 -> return "TESOURA"
        2 -> return "PEDRA"
        3 -> return "PAPEL"
        else -> return ""

    }// return ""

}