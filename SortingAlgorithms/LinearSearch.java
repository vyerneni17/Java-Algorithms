package pkg_sort;

public class LinearSearch {

  private void linear(int[] arr, int arrsize, int key) {

    String foundAt = "";

    for(int i = 0; i < arrsize; i++) {
      if(arr[i] == key) {
        foundAt += i + " ";
      }
    }

    if(foundAt == "") {
      System.out.println("Value not found");
    }
    else {
      System.out.println("Value found at index " + foundAt);
    }
  }

  public static void main(String[] args) {

    ArrayHelpers ahelper = new ArrayHelpers();
    LinearSearch lsearch = new LinearSearch();

    int[] arr = ahelper.arrayGenerator();
    ahelper.printArray(arr);
    lsearch.linear(arr, ahelper.arrsize, 11);

  }

}
