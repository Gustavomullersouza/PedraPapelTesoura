class Pedra {
    fun luta(elemento: String): Int {
        if (elemento.equals("PAPEL")) { // PERDE
            println("Você Perdeu")
            return -1 // perdi pontos
        }
        if (elemento.equals("TESOURA")) { // GANHA
            println("Você Ganhou")
            return 1 // ganha pontos
        }
        return 0 // empate
    }
}