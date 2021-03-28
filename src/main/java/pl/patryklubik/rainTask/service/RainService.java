package pl.patryklubik.rainTask.service;

import org.springframework.stereotype.Service;
import pl.patryklubik.rainTask.RainCalculator;

/**
 * Create by Patryk Łubik on 27.03.2021.
 */


@Service
public class RainService {

    private final RainCalculator rainCalculator = new RainCalculator();

    public int getNumberOfFloodedTableSquares(int[] table) {

        return rainCalculator.getNumberOfFloodedTableSquares(table);
    }
}
