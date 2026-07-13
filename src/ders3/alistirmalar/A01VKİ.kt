package ders3.alistirmalar

// Dersteki örneğimizi kişiselleştirelim. Program çalıştığında önce kullanıcının adını,
// ardından boyunu (cm) ve kilosunu (kg) sorsun.
// Son olarak ekrana şu çıktıyı versin: "Sayın [İsim], Vücut Kitle İndeksiniz: [VKİ Değeri]." VKİ değerini yazdırırken virgülden sonra sadece 2 basamak göstermeyi unutmayın.

fun main() {

    print("Lütfen adınızı giriniz: ")
    val isim = readln()

    print("Lütfen boyunuzu cm olarak giriniz: ")
    val boy = readln().toDouble()

    print("Lütfen kilonuzu giriniz: ")
    val kilo = readln().toDouble()

    val boyMetre = boy / 100

    val vucutKitleIndeksi = kilo / (boyMetre * boyMetre)
    val formatliVKI = "%.2f".format(vucutKitleIndeksi)

    println("Sayın $isim, Vücut Kitle İndeksiniz: $formatliVKI.")





}