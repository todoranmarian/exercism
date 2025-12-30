object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        require(start > 0 )

        var steps = 0
        var tmp = start;

        while (tmp != 1) {
            tmp = if(tmp.isEven()) tmp/2 else tmp * 3 +1
            steps ++
        }

        return steps
    }

    private fun Int.isEven() = this % 2 == 0
}
