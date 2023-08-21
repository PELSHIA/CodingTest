fun main(args: Array<String>) {
    fun solution(phone_number: String): String {
        var answer = ""
        for (i in 0..phone_number.length - 5) {
            answer += "*"
        }
        for (i in phone_number.length - 4..phone_number.length - 1) {
            answer += phone_number[i]
        }
        return answer
    }
}
