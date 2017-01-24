package pkg_sort;

class SelectionSort {

  static ArrayHelpers ahelper = new ArrayHelpers();
  static int arrsize = ahelper.arrsize;

  private void selection(int[] a) {

    for(int i=0; i<arrsize; i++) {
      int smallestIndex = i;
      for(int j=i; j<arrsize; j++) {
        if(a[smallestIndex] > a[j]){
          int temp = a[smallestIndex];
          a[smallestIndex] = a[j];
          a[j] = temp;
        }
        else
          continue;
      }
    }
    System.out.println("Sorted Array is:");
    ahelper.printArray(a);
  }

  public static void main(String[] args) {

    int[] arr = ahelper.arrayGenerator();
    ahelper.printArray(arr);

    SelectionSort ssort = new SelectionSort();
    ssort.selection(arr);

  }

}
