data class data(
    val id: Int,
    val name: String,
    val age: Int
)

fun main() {
    val a = data(1, "Udin", 12)
    val b = data(2, "Wati", 51)
    val c = data(3, "Budi", 34)
    val d = data(4, "Agus", 16)
    val e = data(5, "Sari", 19)
    val f = data(6, "Ririn", 21)


    val data1 = arrayListOf(a, b, c, d, e, f)
    val data2 = data1.filter { it.age < 21 }
    println(data2)

}