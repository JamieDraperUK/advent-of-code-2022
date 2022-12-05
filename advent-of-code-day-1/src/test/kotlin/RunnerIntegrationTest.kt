import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalorieCalculatorIntegrationTest {
    @Test
    fun `calculates the correct highest calorie count`() {
        assertEquals(71300, CalorieCalculator("input.txt"))
    }
}