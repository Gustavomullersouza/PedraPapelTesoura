class Tesoura {
    fun luta(elemento: String): Int {
        if (elemento.equals("PEDRA")) { // PERDE
            println("Você Perdeu")
            return -1 // perdi pontos
        }
        if (elemento.equals("PAPEL")) { // GANHA
            println("Você Ganhou")
            return 1 // ganha pontos
        }
        return 0 // empate
    }
}