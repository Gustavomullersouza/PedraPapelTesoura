class Pedra {
    fun luta(elemento: String): Int {
        if (elemento.equals("PAPEL")) { // PERDE
            return -1
        }
        if (elemento.equals("TESOURA")) { // GANHA
            return 1
        }
        return 0
    }
}