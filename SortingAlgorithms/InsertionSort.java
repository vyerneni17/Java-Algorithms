package pkg_sort;

class InsertionSort {

  static ArrayHelpers ahelper = new ArrayHelpers();
  static int arrsize = ahelper.arrsize;

  private void insertion(int[] a) {

    for(int i=1; i< arrsize; i++) {
      int j = i;
      int toInsert = a[i];

      while((j>0) && a[j-1] > toInsert) {
        a[j] = a[j-1];
        j--;
      }
      a[j] = toInsert;
    }
    System.out.println("Sorted Array is:");
    ahelper.printArray(a);
  }

  public static void main(String[] args) {

    int[] arr = ahelper.arrayGenerator();
    ahelper.printArray(arr);

    InsertionSort isort = new InsertionSort();
    isort.insertion(arr);

  }

}
