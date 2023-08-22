package baekJoon
import java.util.Scanner

fun main(args: Array<String>) {
    val br = Scanner(System.`in`)
    var yPlan = 0
    var mPlan = 0

    val callCnt = br.nextInt()

    for (i in 1..callCnt) {
        val callTime = br.nextInt()

        yPlan += (callTime / 30) * 10 + 10
        mPlan += (callTime / 60) * 15 + 15
    }

    if (yPlan < mPlan) {
        println("Y $yPlan")
    } else if (mPlan < yPlan) {
        println("M $mPlan")
    } else {
        println("Y M $mPlan")
    }
}