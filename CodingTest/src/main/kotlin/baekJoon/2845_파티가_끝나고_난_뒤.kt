package baekJoon
import java.util.Scanner

fun main(args: Array<String>) {
    val br = Scanner(System.`in`)

    val peopleCnt: Int = br.nextInt()
    val area: Int = br.nextInt()

    val areaInPeople = peopleCnt * area

    for (i in 0..4) {
        val people = br.nextInt()
        println(people - areaInPeople)
    }

}