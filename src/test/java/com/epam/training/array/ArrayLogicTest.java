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
        int[] array = new Array().getItems();
        //when
        int[] result = arrayLogic.sort(array);
        //then
        int j = 0;
        for(int i = 0; i < array.length; i++){
            assertTrue(array[i] >= j);
            j = array[i];
        }
    }

    @Test
    public void testSortWhenNumbersNegative(){
        //given
        int[] array = new Array(-1, -5, -8, -9, 0).getItems();
        //when
        int[] result = arrayLogic.sort(array);
        //then
        for(int i = 0; i < array.length; i++){
            assertTrue(array[i] >= array[i++]);
        }
    }

    @Test
    public void testSearch(){
        //given
        int[] array = new Array().getItems();
        //when
        boolean result = arrayLogic.search(array, 4);
        //then
        assertTrue(result);
    }

    @Test
    public void testFindMaxWhenNumberPositive(){
        //given
        Integer[] array = new Array().getWrapedArray();
        //when
        int result = arrayLogic.findMax(array);
        //then
        assertEquals(4, result);
    }

    @Test
    public void testFindMaxWhenNumberNegative(){
        //given
        Integer[] array = new Array(-1, -5, -8, -9, 0).getWrapedArray();
        //when
        int result = arrayLogic.findMax(array);
        //then
        assertEquals(0, result);
    }

    @Test
    public void testFindMimWhenNumberPositive(){
        //given
        Integer[] array = new Array().getWrapedArray();
        //when
        int result = arrayLogic.findMin(array);
        //then
        assertEquals(0, result);
    }

    @Test
    public void testFindMinWhenNumberNegative(){
        //given
        Integer[] array = new Array(-1, -5, -8, -9, 0).getWrapedArray();
        //when
        int result = arrayLogic.findMin(array);
        //then
        assertEquals(-9, result);
    }
}
