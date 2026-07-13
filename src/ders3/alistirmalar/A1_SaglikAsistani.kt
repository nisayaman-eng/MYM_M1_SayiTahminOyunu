package ders3.alistirmalar

fun main() {
    print("Lütfen adınızı girin: ")
    val isim = readln()

    print("Lütfen boyunuzu m cinsinden girin: ")
    var boy = readln().toDouble()

    print("Lütfen kilonuzu girin: ")
    var kilo = readln().toDouble()

    val vucutKitleEnd = "%.2f".format(kilo / (boy * boy))

    println("Sayın $isim, Vücut Kitle İndeksiniz: $vucutKitleEnd.")




}