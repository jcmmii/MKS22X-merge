public class Merge {
  /*sort the array from least to greatest value. This is a wrapper function*/
  //public static void mergesort(int[]data){
  //   mergesortHelp(data,
  //}


  public static void mergesortHelp(int[] data, int lo, int hi) {
    if (lo >= hi) {
      pr(toString(data));
      return;
    }
    int middle = (lo+hi)/2;
    int[] leftArr = new int [middle];
    int[] rightArr = new int [middle];
  //  int i = 0;
    for (int x = lo; x < middle; x++) {
      leftArr[lo] = data[x];
      lo++;
    }
    lo = 0;
    for (int y = middle; y < data.length; y++) {
      rightArr[lo] = data[y];
      lo++;
    }
    mergesortHelp(leftArr,0,leftArr.length);
    mergesortHelp(rightArr,0,rightArr.length);
  }


  private static void pr(String S){
    System.out.println(S);
  }

  public static String toString(int[] array) {
    String ret = "";
    for (int x = 0; x < array.length; x++) {
      ret = ret + array[x] + " ";
    }
    return ret;
  }


  public static void main(String[] args) {
    int[] test = {10,9,8,7};
    mergesortHelp(test,0,test.length);
  }

}



/*
public static void insertionSort(int data[],int lo, int hi) {
  for (int x = lo + 1; x < data.length; x++) {
    int index = x;
    int temp = data[x];
    while (index -1 >= 0 && temp < data[index-1]) {
      data[index] = data[index-1];
      index--;
    }
    data[index] = temp;
  }
}
