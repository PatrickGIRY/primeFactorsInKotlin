package PrimeFactors

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class PrimeFactorsTest {

    @Test
    @DisplayName("1 has no factor")
    fun factors_of_1() {
        assertThat(factorOf(1)).isEmpty()
    }

    @Test
    @DisplayName("2 has 2 as factor")
    fun factors_of_2() {
        assertThat(factorOf(2)).containsExactly(2)
    }

    @Test
    @DisplayName("3 has 3 as factor")
    fun factors_of_3() {
        assertThat(factorOf(3)).containsExactly(3)
    }

    @Test
    @DisplayName("4 has 2 and 2 as factors")
    fun factors_of_4() {
        assertThat(factorOf(4)).containsExactly(2, 2)
    }

    @Test
    @DisplayName("5 has 5 as factor")
    fun factors_of_5() {
        assertThat(factorOf(5)).containsExactly(5)
    }

    @Test
    @DisplayName("6 has 2 and 3 as factors")
    fun factors_of_6() {
        assertThat(factorOf(6)).containsExactly(2, 3)
    }

    @Test
    @DisplayName("7 has 7 as factors")
    fun factors_of_7() {
        assertThat(factorOf(7)).containsExactly(7)
    }

    @Test
    @DisplayName("8 has 2, 2 and 2 as factors")
    fun factors_of_8() {
        assertThat(factorOf(8)).containsExactly(2, 2, 2)
    }

    @Test
    @DisplayName("9 has 3 and 3 as factors")
    fun factors_of_9() {
        assertThat(factorOf(9)).containsExactly(3, 3)
    }

    private fun factorOf(n: Int): List<Int> {
        val factors = mutableListOf<Int>()
        var remainder = n
        var divisor = 2
        while (remainder > 1) {
            while (remainder% divisor == 0) {
                factors.add(divisor)
                remainder /= divisor
            }
            divisor++
        }
        if (remainder > 1) {
            factors.add(remainder)
        }
        return factors
    }


}