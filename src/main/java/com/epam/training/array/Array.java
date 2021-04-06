package com.epam.training.array;

import java.util.Arrays;

//TODO: write a wrapper class for a java int array, make this class immutable
public final class Array {
  
  private final int[] items;

  //not limit to certain number of items
  public Array(int[] items){
    this.items = items;
  }

  public int[] getItems() {
    return items;
  }

  @Override
  public String toString() {
    return "Array{" +
            "wrapedArray=" + Arrays.toString(items) +
            '}';
  }

  //format as agreed with {} always
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Array)) {
      return false;
    }
    Array array = (Array) o;
    return Arrays.equals(items, array.items);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(items);
  }
}

//no logic in test
//test should be linear
