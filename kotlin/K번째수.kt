class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
       var answer = IntArray(commands.size)

        for (i in 0..commands.size - 1) {
            val firstNumber = commands[i][0] - 1
            val secondNumber = commands[i][1] - 1
            val orderNumber = commands[i][2] - 1

            val subArray = array.slice(firstNumber..secondNumber)
            val temp = subArray.sorted()
            answer[i] = temp[orderNumber]
        }
        return answer
    }
}
