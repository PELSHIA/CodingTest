class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 45
        var exist: Int = 0
        val tempArray = numbers.sorted()
        for (i in 0..9) {
            for (j in 0..tempArray.size - 1) {
                if (tempArray[j] == i) {
                    exist += tempArray[j]
                }
            }
        }
        return answer - exist
    }
}
