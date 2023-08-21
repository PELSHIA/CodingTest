fun main(args: Array<String>) {

    fun result(num: Int): Int {
        when (num) {
            6 -> return 1
            5 -> return 2
            4 -> return 3
            3 -> return 4
            2 -> return 5
            else -> return 6
        }
    }

    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var correct: Int = 0
        var exist0: Int = 0
        for (i in 0..5) { // lottos
            if (lottos[i] == 0) {
                exist0 += 1
                continue
            }
            for (j in 0..5) { // win_num
                if (lottos[i] == win_nums[j]) {
                    correct += 1
                }
            }
        }
        answer = intArrayOf(result(correct + exist0), result(correct))
        return answer
    }
}
