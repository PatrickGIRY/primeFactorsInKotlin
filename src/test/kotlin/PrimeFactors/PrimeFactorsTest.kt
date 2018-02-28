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

    private fun factorOf(n: Int): List<Int> {
        val factors = mutableListOf<Int>()
        if (n > 1) {
            factors.add(2)
        }
        return factors
    }


}