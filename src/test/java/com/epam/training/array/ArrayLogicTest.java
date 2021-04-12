package com.epam.training.array;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayLogicTest {

    private ArrayLogic arrayLogic = new ArrayLogic();

    //TODO: add tests for various scenarios
    @Test
    public void testSortArrayShouldSortWhenNumbersPositive(){
        //given
        Array array = new Array(new int[]{1, 5, 6, 8, 2});
        //when
        Array result = arrayLogic.sortArray(array);
        //then
        Array expected = new Array(new int[]{1, 2, 5, 6, 8});
        assertEquals(expected, result);
    }

    @Test
    public void testSortShouldSortWhenNumbersNegative(){
        //given
        Array array = new Array(new int[]{-1, -5, -8, -9, 0});
        //when
        Array result = arrayLogic.sortArray(array);
        //then
        Array expected = new Array(new int[]{-9, -8, -5, -1, 0});
        assertEquals(expected, result);
    }

    @Test
    public void testSearchInArrayShouldSearchWhenNumbersPositive(){
        //given
        Array array = new Array(new int[]{1, 5, 6, 8, 2});
        //when
        boolean result = arrayLogic.searchInArray(array, 5);
        //then
        assertTrue(result);
    }

    @Test
    public void testSearchInArrayShouldSearchWhenNumbersNegative(){
        //given
        Array array = new Array(new int[]{-1, -5, -8, -9, 0});
        //when
        boolean result = arrayLogic.searchInArray(array, -5);
        //then
        assertTrue(result);
    }


    @Test
    public void testFindMaxNumberShouldFindMaxWhenNumberPositive(){
        //given
        Array array = new Array(new int[]{1, 5, 6, 8, 2});
        //when
        int result = arrayLogic.findMaxNumber(array);
        //then
        assertEquals(8, result);
    }

    @Test
    public void testFindMaxNumberShouldFindMaxWhenNumberNegative(){
        //given
        Array array = new Array(new int[]{-1, -5, -8, -9, 0});
        //when
        int result = arrayLogic.findMaxNumber(array);
        //then
        assertEquals(0, result);
    }

    @Test
    public void testFindMinNumberShouldFindMinWhenNumberPositive(){
        //given
        Array array = new Array(new int[]{1, 5, 6, 8, 2});
        //when
        int result = arrayLogic.findMinNumber(array);
        //then
        assertEquals(1, result);
    }

    @Test
    public void testFindMinNumberShouldFindMinWhenNumberNegative(){
        //given
        Array array = new Array(new int[]{-1, -5, -8, -9, 0});
        //when
        int result = arrayLogic.findMinNumber(array);
        //then
        assertEquals(-9, result);
    }

    @Test
    public void testFindPrimeNumbersShouldFindPrimeWhenNumberPositive(){
        //given
        Array array = new Array(new int[]{9, 5, 6, 8, 2});
        //when
        int[] result = arrayLogic.findPrimeNumbers(array);
        //then
        assertArrayEquals(new int[]{5, 2, 0, 0, 0}, result);
    }
}
