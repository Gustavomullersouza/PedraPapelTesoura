class Papel {
    fun luta(elemento: String): Int {
        if (elemento.equals("TESOURA")) { // PERDE
            println("Você Perdeu")
        return -1 // perdi porntos
        }
        if (elemento.equals("PEDRA")) {  // GANHA
            println("Você Ganhou")
            return 1 // ganhei pontos
        }
        return 0 // empate
    }

}