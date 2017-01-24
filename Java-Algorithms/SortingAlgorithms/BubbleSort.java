package pkg_sort;

public class BubbleSort {

  int[] bubble(int[] a, int arrsize) {
    for(int i = arrsize-1; i > 1; i--) {
      for(int j = 0; j < i; j++) {
        if(a[j] > a[j+1]) {
          int temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
        }
      }
    }
    return a;
  }

  public static void main(String[] args) {

      ArrayHelpers ahelper = new ArrayHelpers();
      BubbleSort bsort = new BubbleSort();

      int[] arr = ahelper.arrayGenerator();
      int arrsize = ahelper.arrsize;
      ahelper.printArray(arr);

      int[] sorted = bsort.bubble(arr, arrsize);
      System.out.println("Sorted array is:");
      ahelper.printArray(sorted);
   }
}
