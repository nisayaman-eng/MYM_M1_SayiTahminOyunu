package ders3.alistirmalar

//Kullanıcıdan sepetindeki toplam tutarı (Double) girmesini isteyin.
//Ardından sisteme 10 ile 50 arasında rastgele bir tam sayı ürettirin;
//bu sayı kullanıcının o günkü “Şanslı İndirim Yüzdesi” olacak.
// Bu indirim tutarını hesaplayıp sepet tutarından düşün
// (-= operatörünü kullanın).
// Son olarak ekrana yazdırın: "Tebrikler! Çarktan % [İndirim] indirim kazandınız. Yeni ödeyeceğiniz tutar: [Yeni Tutar] TL."

fun main() {

    print("Sepetinizdeki toplam tutarı giriniz: ")
    var sepetTutari = readln().toDouble()

    var sansliIndrimYuzdesi = (10..50).random()

    val indirimTutari = sepetTutari * sansliIndrimYuzdesi / 100.0
    sepetTutari -= indirimTutari

    println("Tebrikler! Çarktan % ${sansliIndrimYuzdesi} indirim kazandınız. Yeni ödeyeceğiniz tutar: $sepetTutari TL.")



}