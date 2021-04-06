package com.epam.training.array;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayLogicTest {

    private ArrayLogic arrayLogic = new ArrayLogic();

    //TODO: add tests for various scenarios
    @Test
    public void testSortWhenNumbersPositive(){
        //given
        Array array = new Array();
        //when
        int[] result = arrayLogic.sort(array);
        //then
        int j = 0;
        for(int i = 0; i < result.length; i++){
            assertTrue(result[i] >= j);
            j = result[i];
        }
    }

    @Test
    public void testSortWhenNumbersNegative(){
        //given
        Array array = new Array(-1, -5, -8, -9, 0);
        //when
        int[] result = arrayLogic.sort(array);
        //then
        for(int i = 0; i < result.length; i++){
            assertTrue(result[i] >= result[i++]);
        }
    }

    @Test
    public void testSearch(){
        //given
        Array array = new Array();
        //when
        boolean result = arrayLogic.search(array, 4);
        //then
        assertTrue(result);
    }

    @Test
    public void testFindMaxWhenNumberPositive(){
        //given
        Array array = new Array();
        //when
        int result = arrayLogic.findMax(array);
        //then
        assertEquals(4, result);
    }

    @Test
    public void testFindMaxWhenNumberNegative(){
        //given
        Array array = new Array(-1, -5, -8, -9, 0);
        //when
        int result = arrayLogic.findMax(array);
        //then
        assertEquals(0, result);
    }

    @Test
    public void testFindMimWhenNumberPositive(){
        //given
        Array array = new Array();
        //when
        int result = arrayLogic.findMin(array);
        //then
        assertEquals(0, result);
    }

    @Test
    public void testFindMinWhenNumberNegative(){
        //given
        Array array = new Array(-1, -5, -8, -9, 0);
        //when
        int result = arrayLogic.findMin(array);
        //then
        assertEquals(-9, result);
    }

    @Test
    public void testFindPrimeNumbers(){
        //given
        Array array = new Array();
        //when
        int[] result = arrayLogic.findPrimeNumbers(array);
        //then
        assertArrayEquals(new int[]{0, 1, 2, 3, 0}, result);
    }
}
