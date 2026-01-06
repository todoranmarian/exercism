object Bob {
    fun hey(input: String): String {
        val trimmed = input.trim()
        val letters = input.filter { it.isLetter() }

        val isSilence = trimmed.isEmpty()
        val isQuestion = trimmed.endsWith('?')
        val isYelling = letters.isNotEmpty() && letters.all { it.isUpperCase() }

        return when {
            isQuestion && isYelling -> "Calm down, I know what I'm doing!"
            isQuestion -> "Sure."
            isYelling -> "Whoa, chill out!"
            isSilence -> "Fine. Be that way!"
            else -> "Whatever."
        }
    }
}
