import java.io.File

object CalorieCalculator {
    operator fun invoke(filePath: String): Int =
        FindMaxCalorieCount(CalorieDataProcessor(File(filePath).readText()))
}

object FindMaxCalorieCount {
    operator fun invoke(values: List<Set<Int>>) = values.map { it.sum() }.maxOf { it }
}

object CalorieDataProcessor {
    operator fun invoke(rawInput: String): List<Set<Int>> = rawInput
        .split(newDataInputMarker)
        .map { it.split(relatedDataInputMaker).filter(String::isNotBlank) }
        .map { it.map { calorieValue -> calorieValue.toInt() }.toSet() }

    private const val newDataInputMarker = "\n\n"
    private const val relatedDataInputMaker = "\n"
}

