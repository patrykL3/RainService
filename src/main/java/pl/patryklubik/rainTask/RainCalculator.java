package pl.patryklubik.rainTask;

/**
 * Create by Patryk Łubik on 27.03.2021.
 */

public class RainCalculator {


    public int getNumberOfFloodedTableSquares(int[] table) {

        int[] highestPointFromLeft = getHighestPointFromLeft(table);
        int[] highestPointFromRight = getHighestPointFromRight(table);

        return calculateNumberOfFloodedTableSquares(table, highestPointFromLeft, highestPointFromRight);
    }

    private int[] getHighestPointFromLeft(int[] table) {

        int[] highestPointFromLeft = new int[table.length];
        highestPointFromLeft[0] = table[0];

        for (int i = 1; i < table.length; i++) {
            highestPointFromLeft[i] = Math.max(highestPointFromLeft[i - 1], table[i]);
        }

        return highestPointFromLeft;
    }

    private int[] getHighestPointFromRight(int[] table) {

        int[] highestPointFromRight = new int[table.length];
        int lastTableIndexNumber = table.length - 1;
        int penultimateTableIndexNumber = table.length - 2;

        highestPointFromRight[lastTableIndexNumber] = table[lastTableIndexNumber];

        for (int i = penultimateTableIndexNumber; i >= 0; i--) {
            highestPointFromRight[i] = Math.max(highestPointFromRight[i + 1], table[i]);
        }

        return highestPointFromRight;
    }

    private int calculateNumberOfFloodedTableSquares(int[] table, int[] highestPointFromLeft, int[] highestPointFromRight) {

        int numberOfFloodedTableSquares = 0;

        for (int i = 0; i < table.length; i++) {
            numberOfFloodedTableSquares += Math.min(highestPointFromLeft[i], highestPointFromRight[i]) - table[i];
        }

        return numberOfFloodedTableSquares;
    }
}
