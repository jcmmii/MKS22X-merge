public class Merge {
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
  //  return mergesortHelp(data,)
  }

  public static void mergesortHelp(int[] data, int lo, int hi) {
    if (lo >= hi) return;
    int middle = (lo+hi)/2;
    int[] leftArr = new int [middle];
    int[] rightArr = new int [middle];
    int i = 0;
    for (int x = lo; x < middle; x++) {
      leftArr[i] = data[x];
      i++;
    }
    i = 0;
    for (int y = middle; y < data.length; y++) {
      rightArr[i] = data[y];
      i++;
    }
  //  mergesortHelp
  }

  public static void main(String[] args) {
    int[] test = {10,9,8,7,6,5,4,3,2,1};
    mergesortHelp(test,0,test.length);
  }

}
