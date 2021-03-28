package pl.patryklubik.rainTask.controller;

import org.junit.jupiter.api.Test;
import pl.patryklubik.rainTask.service.RainService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Create by Patryk Łubik on 28.03.2021.
 */
class RainControllerTest {

    @Test
    public void controllerShouldReturnCorrectValueOfNumberOfFloodedTableSquares() {

        //given
        RainController rainController = new RainController(new RainService());
        int[] tableToCheck = {1, 2, 0, 4, 3, 1, 2};
        int expectedNumberOfFloodedTableSquares = 3;

        //when
        int numberOfFloodedTableSquaresFromController = rainController.getNumberOfFloodedTableSquares(tableToCheck);

        //then
        assertThat(numberOfFloodedTableSquaresFromController, equalTo(expectedNumberOfFloodedTableSquares));
    }

}