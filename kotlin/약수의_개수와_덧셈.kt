class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        var measureCnt: Int = 0
        for (i in left..right) {
            for (j in 1..i) {
                if (i% j == 0) {
                    measureCnt++
                }
            }
            if (measureCnt % 2 == 0) {
                answer += i
            } else {
                answer -= i
            }
            measureCnt = 0
        }
        return answer
    }
}
