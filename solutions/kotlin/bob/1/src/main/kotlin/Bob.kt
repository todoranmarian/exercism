object Bob {
    fun hey(input: String): String {
        val isQuestion = input.contains('?') && input.trim().last() == '?'
        val isYelling = input.filter { it.isLetter() }.let { it.isNotEmpty() && it.all(Char::isUpperCase) }
        val isSilence = input.isEmpty() || input.isBlank()

        if (isQuestion && isYelling) return "Calm down, I know what I'm doing!"

        if (isQuestion) return "Sure."

        if (isYelling) return "Whoa, chill out!"

        if (isSilence) return "Fine. Be that way!"

        return "Whatever."
    }
}