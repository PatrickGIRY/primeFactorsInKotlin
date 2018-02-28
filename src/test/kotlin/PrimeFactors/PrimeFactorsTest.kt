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

    private fun factorOf(n: Int): List<Int> {
        val factors = mutableListOf<Int>()
        var remainder = n
        if (remainder > 1) {
            if (remainder%2 == 0) {
                factors.add(2)
                remainder /= 2
            }
        }
        if (remainder > 1) {
            factors.add(remainder)
        }
        return factors
    }


}