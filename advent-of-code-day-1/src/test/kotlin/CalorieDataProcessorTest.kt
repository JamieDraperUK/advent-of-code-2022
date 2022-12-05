import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalorieDataProcessorTest {

    @Test
    fun `group raw input`() {
        val rawInput = "1\n2\n3\n\n10\n20\n\n100"

        val grouped = CalorieDataProcessor(rawInput)

        val expectedValues = listOf(
            setOf(1, 2, 3),
            setOf(10, 20),
            setOf(100)
        )

        assertEquals(expectedValues, grouped)
    }

    @Test
    fun `group raw input with blank values`() {
        val rawInput = "1\n2\n3\n\n10\n\n\n100"

        val grouped = CalorieDataProcessor(rawInput)

        val expectedValues = listOf(
            setOf(1, 2, 3),
            setOf(10),
            setOf(100)
        )

        assertEquals(expectedValues, grouped)
    }
}

