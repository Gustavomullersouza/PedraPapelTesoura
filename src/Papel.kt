class Papel {
    fun luta(elemento: String): Int {
        if (elemento.equals("TESOURA")) { // PERDE
        return -1 // perdi porntos
        }
        if (elemento.equals("PEDRA")) {  // GANHA
            return 1 // ganhei pontos
        }
        return 0 // empate
    }

}