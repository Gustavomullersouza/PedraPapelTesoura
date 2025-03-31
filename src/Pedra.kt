class Pedra {
    fun luta(elemento: String): Int {
        if (elemento.equals("PAPEL")) { // PERDE
            return -1 // perdi pontos
        }
        if (elemento.equals("TESOURA")) { // GANHA
            return 1 // ganha pontos
        }
        return 0 // empate
    }
}