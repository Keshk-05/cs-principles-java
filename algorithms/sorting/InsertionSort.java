// A class with a method called sort that uses
// insertion sort to sort an int of arrays

public class InsertionSort {
  
  
  public static int[] sortDesend(int[] nums) {
    int dividingIndex = 0;

    for (int i = 1; i < nums.length; i++) {
      boolean swap = true;
      for (int j = dividingIndex + 1; j > 0 && swap; j--) {
        if (nums[j] < nums[j - 1]) {
          swap = true;
          int holder = nums[j];
          nums[j] = nums[j - 1];
          nums[j - 1] = holder;
        } else {
          swap = false;
        }
      }
      dividingIndex++;
    }

    return nums;
  }

  public static int[] sortAsend(int[] nums) {
    int dividingIndex = 0;

    for (int i = 1; i < nums.length; i++) {
      boolean swap = true;
      for (int j = dividingIndex + 1; j > 0 && swap; j--) {
        if (nums[j] > nums[j - 1]) {
          swap = true;
          int holder = nums[j];
          nums[j] = nums[j - 1];
          nums[j - 1] = holder;
        } else {
          swap = false;
        }
      }
      dividingIndex++;
    }

    return nums;
  }

  public static void main(String[] args){
    int[] test = {5,4,3,2,1,5,6};
    
    int[] result = sortDesend(test);
    System.out.println("Array in desending order:");
    for (int val : result) {
      System.out.print(val + " ");
    }

    System.out.println("");

    result = sortAsend(test);
    System.out.println("Array in asending order:");
    for (int val : result) {
      System.out.print(val + " ");
    }

    System.out.println("");
  }
}