package ders5

fun main() {
    print("1-6 arasında bir zar tahmini yazın: ")
    val tahmin = readln().toIntOrNull()

    if (tahmin == null){
        println("Lütfen bir tam sayı değeri girin!")
        return
    }

    if (tahmin > 6 || tahmin < 1){
        println("Zar sadece 1, 2, 3, 4, 5 veya 6 gelebilir!")
    }else {
        val zar = (1..6).random()

        if (tahmin == zar){
            println("Tebrikler, Zar $zar geldi ve doğru bildiniz.")
        }else{
            println("Maalesef bilemediniz. zar $zar gelmişti.")
        }

    }


}