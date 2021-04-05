package com.epam.training.array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayLogic {

    //TODO: write it using binary search
    public boolean search(int[] array, int searchedNumber) {
        sort(array);
        int searchResult = Arrays.binarySearch(array, searchedNumber);

        int arrayLength = array.length;
        int indexOfNumber = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == searchedNumber) {
                indexOfNumber =  i;
            }
        }

        if (searchResult == indexOfNumber){
            return true;
        }else {
            return false;
        }
    }

    public int[] findPrimeNumbers(int[] array) {
        int j = 0;
        int k = 0;
        int l = 0;
        int[] primeNumbers = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            j = 2;
            k = 1;
            while (j < array[i]) {
                if (array[i] % j == 0) {
                    k = 0;
                    break;
                }
                j++;
            }
            if (k == 1) {
                primeNumbers[l] = array[i];
                l++;
            }
        }
        return primeNumbers;
    }

    //TODO: add other methods here
    public int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public int findMax(Integer[] array) {
        int max = Collections.max(Arrays.asList(array));
        return max;
    }

    public int findMin(Integer[] array) {
        int min = Collections.min(Arrays.asList(array));
        return min;
    }
}
