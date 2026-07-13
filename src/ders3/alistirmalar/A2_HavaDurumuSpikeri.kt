package ders3.alistirmalar

import java.util.Locale
import java.util.Locale.getDefault

//Kullanıcıdan yaşadığı şehri,
// bugünün en düşük ve en yüksek sıcaklık değerlerini girmesini isteyin.
// String şablonlarını kullanarak
// şu anons metnini oluşturun:
// "Burası [Şehir]. Bugün sıcaklık [Düşük] ile [Yüksek] derece arasında değişecek. Ortalama sıcaklık ise [Ortalama] derece." (Ortalamayı bulmak için iki değeri toplayıp ikiye bölebilirsiniz).

fun main() {

    print("Yaşadığınız şehri yazınız: ")
    val sehir = readln()

    print("Bugünün en düşük sıcaklık değerini yazınız: ")
    val enDusukSicaklik = readln().toDouble()

    print("Bugünün en yüksek sıcaklık değerini yazınız: ")
    val enYuksekSicaklik = readln().toDouble()

    val ortalama = (enYuksekSicaklik + enDusukSicaklik) / 2

    println("Burası ${sehir.substring(0,1).uppercase() + sehir.substring(1).lowercase()} Bugün sıcaklık $enDusukSicaklik ile $enYuksekSicaklik derece arasında değişecek. Ortalama sıcaklık ise $ortalama derece.")










}