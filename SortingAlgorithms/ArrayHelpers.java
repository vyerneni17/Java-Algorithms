package pkg_sort;

class ArrayHelpers {

  int arrsize = 10;

   public int[] arrayGenerator(){
    int[] arr = new int[50];
    for(int i=0; i < arrsize; i++){
      arr[i] = (int)(Math.random()*10)+10;
    }
    return arr;
  }

   public int findValue(int[]arr, int key){
    for(int i=0;i < arrsize; i++){
      if(arr[i] == key){
        return i;
      }
    }
    return -1;
  }

   public int[] deleteValue(int[] arr, int value) {
    int[] found = new int[arrsize];
    int emptyIndex = 0;
      for(int i=0; i < arrsize; i++) {
        if(arr[i] != value){
          found[emptyIndex] = arr[i];
          emptyIndex++;
        }
      }
    return found;
  }

   public void printArray(int[] array) {

    // System.out.println("-------------");

    System.out.println("-------------------------------------------------------------------");
    System.out.print("| Key  | ");
    for(int i=0; i < arrsize; i++) {
      System.out.print(i + "  |  ");
    }
    System.out.println("");
    System.out.println("-------------------------------------------------------------------");

    System.out.print("| Value| ");
    for(int i=0; i < arrsize; i++) {
      System.out.print(array[i] + " |  ");
    }
    System.out.println("");
    System.out.println("-------------------------------------------------------------------");
  }

  public static void main(String[] args) {
    ArrayHelpers asort = new ArrayHelpers();
    int[] array = new int[10];
    array = asort.arrayGenerator();
    asort.printArray(array);
    // int val = asort.findValue(array, 17);
    // System.out.println("Value found at: " +val);
    // int[] arr = asort.deleteValue(array, 18);
    // System.out.println("New Found array is: ");
    // asort.printArray(arr);
  }
}
