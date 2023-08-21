fun main(args: Array<String>) {
    fun palindrome(str: String, start: Int, end: Int): Boolean { // 펠린드롬 판별 함수
        var s = start
        var e = end
        while (s < e) {
            if (str[s] != str[e]) {
                return false
            }
            s++
            e--
        }
        return true
    }

    fun solution(s: String): Int {
        var answer = 1 // 팰린드롬이 없을 시, 기본값 1

        for (len in s.length downTo 2) {
            for (start in 0 until s.length - len) {
                if (palindrome(s, start, start + len)) return len + 1
            }
        }
        return answer
    }

}
