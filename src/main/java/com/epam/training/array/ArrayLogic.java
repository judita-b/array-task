package com.epam.training.array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayLogic {

    //TODO: write it using binary search
    public boolean searchInArray(Array array, int searchedNumber) {
        int[] items = array.getItems();
        //int searchResult = Arrays.binarySearch(items, searchedNumber);

        int arrayLength = items.length;
        int indexOfNumber = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (items[i] == searchedNumber) {
                return true;
            }
        }
        return false;
    }

    public int[] findPrimeNumbers(Array array) {
        int[] items = array.getItems();
        int j = 0;
        int k = 0;
        int l = 0;
        int[] primeNumbers = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            j = 2;
            k = 1;
            while (j < items[i]) {
                if (items[i] % j == 0) {
                    k = 0;
                    break;
                }
                j++;
            }
            if (k == 1) {
                primeNumbers[l] = items[i];
                l++;
            }
        }
        return primeNumbers;
    }

    //TODO: add other methods here
    public Array sortArray(Array array) {
        int[] items = array.getItems();
        for (int i = 0; i < items.length; i++) {
            for (int j = i + 1; j < items.length; j++) {
                int tmp = 0;
                if (items[i] > items[j]) {
                    tmp = items[i];
                    items[i] = items[j];
                    items[j] = tmp;
                }
            }
        }
        return array;
    }

    public int findMaxNumber(Array array) {
        int[] items = array.getItems();
        int max = items[0];
        for (int i = 0; i <items.length; i++) {
            if (items[i] > max){
                max = items[i];
            }
        }
        return max;
    }

    public int findMinNumber(Array array) {
        int[] items = array.getItems();
        int min = items[0];
        for (int i = 0; i <items.length; i++) {
            if (items[i] < min){
                min = items[i];
            }
        }
        return min;
    }
}
