class Tesoura {
    var pontos: Int = 0
    fun luta(elemento: String) {
        if (elemento.equals("PEDRA")) { // PERDE
            pontos--
        }
        if (elemento.equals("PAPEL")) { // GANHA
            pontos++
        }
    }
}