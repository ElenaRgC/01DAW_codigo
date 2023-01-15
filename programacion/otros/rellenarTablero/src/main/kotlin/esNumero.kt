fun esNumero(entrada: String): Boolean {
    val regex = "-?[0-9]+(\\.[0-9]+)?".toRegex()
    return entrada.matches(regex)
}