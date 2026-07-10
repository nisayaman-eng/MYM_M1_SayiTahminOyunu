package ders3

fun main() {
    var sepetTutari = 120

    sepetTutari -= sepetTutari * 15 / 100
    println("Sepet Tutarı: " + sepetTutari + "₺")

    sepetTutari += 55
    println("Sepet Tutarı (kargo dahil): " + sepetTutari + "₺")



}
