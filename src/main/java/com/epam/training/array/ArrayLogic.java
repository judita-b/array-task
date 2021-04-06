package com.epam.training.array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayLogic {

    //TODO: write it using binary search
    public boolean search(Array array, int searchedNumber) {
        int[] arr = array.getItems();
        sort(array);
        int searchResult = Arrays.binarySearch(arr, searchedNumber);

        int arrayLength = arr.length;
        int indexOfNumber = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (arr[i] == searchedNumber) {
                indexOfNumber =  i;
            }
        }

        if (searchResult == indexOfNumber){
            return true;
        }else {
            return false;
        }
    }

    public int[] findPrimeNumbers(Array array) {
        int[] arr = array.getItems();
        int j = 0;
        int k = 0;
        int l = 0;
        int[] primeNumbers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            j = 2;
            k = 1;
            while (j < arr[i]) {
                if (arr[i] % j == 0) {
                    k = 0;
                    break;
                }
                j++;
            }
            if (k == 1) {
                primeNumbers[l] = arr[i];
                l++;
            }
        }
        return primeNumbers;
    }

    //TODO: add other methods here
    public int[] sort(Array array) {
        int[] arr = array.getItems();
        Arrays.sort(arr);
        return arr;
    }

    public int findMax(Array array) {
        Integer[] arr = array.getWrapedArray();
        int max = Collections.max(Arrays.asList(arr));
        return max;
    }

    public int findMin(Array array) {
        Integer[] arr = array.getWrapedArray();
        int min = Collections.min(Arrays.asList(arr));
        return min;
    }
}
