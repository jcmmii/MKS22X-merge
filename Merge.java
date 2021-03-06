import java.util.*;

public class Merge {
  //insertionSort: modified so that it works on a subarray
  public static void insertionSort(int data[],int lo, int hi) {
    for (int x = lo + 1; x < hi; x++) {
      int index = x;
      int temp = data[x];
      while (index -1 >= 0 && temp < data[index-1]) {
        data[index] = data[index-1];
        index--;
      }
      data[index] = temp;
    }
  }

  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
     mergesortHelp(data,0,data.length);
  }

  //helper method for mergesort
  public static void mergesortHelp(int[] data, int lo, int hi) {
    //insertionSort optimization if the subarray is small enough
    //determined that the best size is 40(or around that)
    if (hi-lo <= 40) {
      insertionSort(data,lo,hi);
      return;
    }

    if (lo + 1 >= hi) return;

    //get middle value
    //create two arrays copying over values: leftArr gets first half, rightArr gets second
    //use Arrays.copyOfRange to copy over part of the original data array
    int middle = (hi+lo)/2;
    int[] leftArr = Arrays.copyOfRange(data,lo,middle);
    int[] rightArr = Arrays.copyOfRange(data,middle,hi);

    mergesortHelp(leftArr,0,leftArr.length);
    mergesortHelp(rightArr,0,rightArr.length);

    //keeping count of indices
    int index = 0;
    int rCount = 0;
    int lCount = 0;

    while (lCount < leftArr.length && rCount < rightArr.length) {
      //if value at leftArr[lCount] is <= rightArr[rCount] then sets the data index to that value
      //adds 1 to lCount
      //keeps repeating
      //else: right[rCount] is greater, sets that to the data index, rCount is added by 1
      //index goes up every time after each comparison is done
      if (leftArr[lCount] <= rightArr[rCount]) {
        data[index] = leftArr[lCount];
        lCount++;
      } else {
        data[index] = rightArr[rCount];
        rCount++;
      }
      index++;
    }

    //any leftover values are added on
    while (rCount < rightArr.length) {
      data[index] = rightArr[rCount];
      rCount++;
      index++;
    }

    while(lCount < leftArr.length) {
      data[index] = leftArr[lCount];
      lCount++;
      index++;
    }

  }

  public static String toString(int[] array) {
    String ret = "";
    for (int x = 0; x < array.length; x++) {
      ret = ret + array[x] + " ";
    }
    return ret;
  }
/*
  public static void main(String[] args) {
    int[] test = {10,9,8,7};
    mergesortHelp(test,0,test.length);
    System.out.println(toString(test));
  }
  */


}
