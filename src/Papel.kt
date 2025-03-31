class Papel {
    fun luta(elemento: String): Int {
        if (elemento.equals("TESOURA")) { // PERDE
        return -1
        }
        if (elemento.equals("PEDRA")) {  // GANHA
            return 1
        }
        return 0
    }

}