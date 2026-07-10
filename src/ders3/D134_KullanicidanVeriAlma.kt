package ders3

fun main() {
    print("Lütfen adınzı giriniz: ")
    val isim = readln()

    print("Kilonu gir: ")
    var dunyaKilosu = readln().toDouble()

    println("Adınız $isim, Dünyadaki Kilonuz: $dunyaKilosu kg")

    val marsKilosu = dunyaKilosu * 0.38

    val formatliMarsKilosu = "%.2f".format(marsKilosu)
    println("Marstaki kilonuz $formatliMarsKilosu")

}