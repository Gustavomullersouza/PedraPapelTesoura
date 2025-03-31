class Pedra {
    var pontos: Int = 0
    fun luta(elemento: String) {
        if (elemento.equals("PAPEL")) { // PERDE
            pontos--
        }
        if (elemento.equals("TESOURA")) { // GANHA
            pontos++
        }
    }
}