class Tesoura {
    fun luta(elemento: String): Int {
        if (elemento.equals("PEDRA")) { // PERDE
            return -1 // perdi pontos
        }
        if (elemento.equals("PAPEL")) { // GANHA
            return 1 // ganha pontos
        }
        return 0 // empate
    }
}