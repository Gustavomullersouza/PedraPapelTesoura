class Tesoura {
    fun luta(elemento: String): Int {
        if (elemento.equals("PEDRA")) { // PERDE
            return -1
        }
        if (elemento.equals("PAPEL")) { // GANHA
            return 1
        }
        return 0
    }
}