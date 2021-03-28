package pl.patryklubik.rainTask;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


/**
 * Create by Patryk Łubik on 28.03.2021.
 */

class RainCalculatorTest {

    @Test
    public void getNumberOfFloodedTableSquaresShouldReturnCorrectValue() {

        //given
        RainCalculator rainCalculator = new RainCalculator();
        int[] tableToCheck = {1, 2, 0, 4, 3, 1, 2};
        int expectedNumberOfFloodedTableSquares = 3;

        //when
        int numberOfFloodedTableSquaresFromCalculator = rainCalculator.getNumberOfFloodedTableSquares(tableToCheck);

        //then
        assertThat(numberOfFloodedTableSquaresFromCalculator, equalTo(expectedNumberOfFloodedTableSquares));
    }

}