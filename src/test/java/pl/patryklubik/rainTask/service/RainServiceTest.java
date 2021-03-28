package pl.patryklubik.rainTask.service;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Create by Patryk Łubik on 28.03.2021.
 */

class RainServiceTest {

    @Test
    public void serviceShouldReturnCorrectValueOfNumberOfFloodedTableSquares() {

        //given
        RainService rainService = new RainService();
        int[] tableToCheck = {1, 2, 0, 4, 3, 1, 2};
        int expectedNumberOfFloodedTableSquares = 3;

        //when
        int numberOfFloodedTableSquaresFromService = rainService.getNumberOfFloodedTableSquares(tableToCheck);

        //then
        assertThat(numberOfFloodedTableSquaresFromService, equalTo(expectedNumberOfFloodedTableSquares));
    }
}