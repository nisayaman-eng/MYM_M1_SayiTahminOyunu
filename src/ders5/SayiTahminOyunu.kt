package ders5

fun main() {

    val rastgeleSayi = (1..100).random()
    println(rastgeleSayi)

    println("Sayı Tahmin Oyununa Hoş Geldiniz 🙌")
    print("Sayıyı tahmin ediniz: ")
    val tahmin = readln().toIntOrNull()


    if (tahmin == null){
        println("Lütfen geçerli bir sayı giriniz ❌")
    }else if(tahmin < 1 || tahmin > 100){
        println("Lütfen 1 ile 100 arasında bir sayı giriniz‼️ ")
    }else if (tahmin > rastgeleSayi){
        println("Daha KÜÇÜK bir sayı giriniz😶‍🌫️")
    }else if (tahmin < rastgeleSayi){
        println("Daha BÜYÜK bir sayı giriniz🤐")
    }else{
        println("Tebrikler doğru tahmin ettiniz😊🥳🎉")
    }

}