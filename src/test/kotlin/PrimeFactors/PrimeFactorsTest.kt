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

    private fun factorOf(n: Int): List<Int> {
        return emptyList()
    }


}