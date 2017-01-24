package pkg_sort;

class BinarySearch {
  static ArrayHelpers ahelper = new ArrayHelpers();
  static BubbleSort bsort = new BubbleSort();
  static int arrsize = ahelper.arrsize;

  private void binarySearch(int[] arr,int key) {
    int lowerIndex = 0;
    int higherIndex = arrsize-1;
    String valueAt = "";
    while(lowerIndex < higherIndex) {
      int middleIndex = (lowerIndex + higherIndex)/2;
      if(arr[middleIndex] < key){
          lowerIndex = middleIndex + 1;
      }
      else if(arr[middleIndex] > key) {
        higherIndex = middleIndex - 1;
      }
      else {
        valueAt += middleIndex;
        System.out.println("Value found at: " + valueAt);
        lowerIndex = higherIndex+1;
      }
    }
    if(valueAt == "") {
      System.out.println("Value not found!");
    }
  }

  public static void main(String[] args) {
    BinarySearch bsearch = new BinarySearch();
    int[] arr = ahelper.arrayGenerator();
    int[] sorted = bsort.bubble(arr, arrsize);
    ahelper.printArray(sorted);
    bsearch.binarySearch(sorted, 15);
  }
}
