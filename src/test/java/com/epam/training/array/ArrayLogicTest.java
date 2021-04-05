package com.epam.training.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayLogicTest {

    //TODO: add tests for various scenarios
    @Test
    public void testSortWhenNumbersPositive(){
        //given
        int[] array = new Array().getItems();
        //when
        int[] result = ArrayLogic.sort(array);
        //then
        int j = 0;
        for(int i = 0; i < array.length; i++){
            assertTrue(array[i] >= j);
            j = array[i];
        }
    }

}
