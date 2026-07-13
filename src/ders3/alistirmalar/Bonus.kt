package ders3.alistirmalar

fun main() {
    var ejderhaninCani = 1000.0

    println("Ejderhanın adı ne olsun?")
    val ejderhaninAdi = readln()

    println("Ejderhanın saldırı gücünü girin: ")
    var saldiriGucu = readln().toDouble()

    val kritikHasarBonusu = (10..50).random()
    saldiriGucu += kritikHasarBonusu

    ejderhaninCani -= saldiriGucu

   val  formatliEjderhaCani = "%.2f".format(ejderhaninCani)

    println("""
        Kahramanın Adı: $ejderhaninAdi
        Saldırı Gücü: $saldiriGucu
        Kritik Hasar: $kritikHasarBonusu
        Ejderhanın kalan Canı: ${ejderhaninCani}
    """.trimIndent())

}