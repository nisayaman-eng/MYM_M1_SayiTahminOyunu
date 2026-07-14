package ders4

fun main() {

    val karanlikModAktif = false

    val arkaPLanRengi =
        if (karanlikModAktif){
            "#000000 - Siyah"
        }else{
            "#FFFFFF - Beyaz"
        }

    println("Arka Plan Rengi: $arkaPLanRengi")




}