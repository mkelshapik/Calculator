object Calculator {
    // "6 + 3 * 2"
    fun evaluate(expression: String): Float {
        return expression.split("+")
            .map {
                it.split("-")
                    .map {
                        it.split("*")
                            .map {
                                it.split("/")
                                    .map { it.toFloat() }
                                    .reduce { acc, s -> acc / s }
                            }
                            .reduce { acc, s -> acc * s }
                    }
                    .reduce { acc, s -> acc - s }
            }
            .reduce { acc, s -> acc + s }
    }
}