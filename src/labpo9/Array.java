/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpo9;

import java.util.Arrays;

/**
 *
 * @author VITGR
 */
public class Array {

    private int[][] value;

    Array(int[][] value) {
        this.value = value;
    }

    public int[][] sortArray() {
        int[][] sortedArray = Arrays.copyOf(value, value.length);
        int height = value.length;
        int width = value[0].length;
        int buffer;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                for (int x = 0; x < height; x++) {
                    for (int y = 0; y < width; y++) {
                        if (value[i][j] < value[x][y]) {
                            buffer = sortedArray[i][j];
                            sortedArray[i][j] = sortedArray[x][y];
                            sortedArray[x][y] = buffer;
                        }
                    }
                }
            }
        }
        return sortedArray;
    }
}
