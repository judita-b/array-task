package com.epam.training.array;

import java.util.Arrays;

public class ArrayLogic {

    public int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }

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

    public Array findPrimeNumbers(Array array) {
        throw new UnsupportedOperationException();
    }
    
   //TODO: add other methods here

}
