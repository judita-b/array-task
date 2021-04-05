package com.epam.training.array;

import java.util.Arrays;

//TODO: write a wrapper class for a java int array, make this class immutable
public final class Array {
  
  final private int[] items = new int[5];
  final private Integer[] wrapedArray = new Integer[items.length];

  public Array(){
    for (int i = 0; i < 5; i++){
      items[i] = i;
    }
    int i = 0;
    for (int value : items) {
      wrapedArray[i++] = value;
    }
  }

  public Array(int a, int b, int c, int d, int e){
    this.items[0] = a;
    items[1] = b;
    items[2] = c;
    items[3] = d;
    items[4] = e;

    int i = 0;
    for (int value : items) {
      wrapedArray[i++] = value;
    }
  }

  public Integer[] getWrapedArray() {
    return wrapedArray;
  }

  @Override
  public String toString() {
    return "Array{" +
            "wrapedArray=" + Arrays.toString(wrapedArray) +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Array)) return false;
    Array array = (Array) o;
    return Arrays.equals(getWrapedArray(), array.getWrapedArray());
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(getWrapedArray());
  }
}
