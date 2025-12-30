object Darts {

    fun score(x: Number, y: Number): Int {
        val xFloat = x.toDouble()
        val yFloat = y.toDouble()
        val distance = xFloat * xFloat + yFloat * yFloat

        return when {
            distance <= 1.0   -> 10
            distance <= 25.0  -> 5
            distance <= 100.0 -> 1
            else              -> 0
        }
    }
}
