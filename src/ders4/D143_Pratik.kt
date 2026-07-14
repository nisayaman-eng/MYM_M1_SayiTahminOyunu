package ders4

fun main() {
    print("Lütfen sepet tutarınızı girin: ")
    val tutar = readln().toDoubleOrNull()

    if (tutar == null){
        println("Lütfen sayı girin.")
    }else if (tutar >= 500){
        println("Süper Fırsat! %20 İndirim Kazandınız.")
    }else if (tutar >= 200){
        println("Kargo Bedava!")
    }else{
        println("İndirim için lütfen ürün ekleyiniz")
    }







}