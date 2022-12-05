import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class CalorieCounterTest {
    @Test
    fun `return the highest calorie count`() {
        val calories = listOf(
            setOf(1,2,3),
            setOf(10,12,1),
            setOf(100)
        )

        val highestCalorieCount = FindMaxCalorieCount(calories)

        assertEquals(100, highestCalorieCount)
    }
}

