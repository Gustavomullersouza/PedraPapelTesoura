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
}