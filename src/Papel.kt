class Papel {
    var pontos: Int = 0
    fun luta(elemento: String) {
        if (elemento.equals("TESOURA")) { // PERDE
        pontos--
        }
        if (elemento.equals("PEDRA")) {  // GANHA
            pontos++
        }
    }
}