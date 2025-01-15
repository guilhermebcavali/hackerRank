package LeftRotation;

import java.util.*;

class Result {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     * 1. INTEGER_ARRAY a
     * 2. INTEGER d = number of rotations
     */

     public static List<Integer> rotLeft(List<Integer> array, int rotationsNumber) {
        List<Integer> rotatedArray = new ArrayList<>();

        int d = rotationsNumber % array.size();

        // Slice 1: d...<array.size()
        for(int i = d; i < array.size(); i++) {
            rotatedArray.add(array.get(i));
        }

        // Slice 2: 0...<d
        for(int i = 0; i < d; i++) {
            rotatedArray.add(array.get(i));
        }

        return rotatedArray;
    }
}
