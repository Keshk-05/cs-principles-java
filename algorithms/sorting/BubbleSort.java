// A class with a method called sort that uses
// bubble sort to sort an int of arrays

public class BubbleSort {

  // method for decending order
  public static int[] sortDesend(int[] nums) {
    boolean swap;
    do {
      swap = false;
      for(int i = 0; i < nums.length - 1; i++) {
        if(nums[i] > nums[i + 1]) {
          swap = true;
          int valueHolder;
          valueHolder = nums[i];
          nums[i] = nums[i + 1];
          nums[i + 1] = valueHolder;
        }
      }
    } while(swap);

    return nums;
  }

  public static int[] sortAsend(int[] nums) {
    boolean swap;
    do {
      swap = false;
      for(int i = 0; i < nums.length - 1; i++) {
        if(nums[i] < nums[i + 1]) {
          swap = true;
          int valueHolder;
          valueHolder = nums[i];
          nums[i] = nums[i + 1];
          nums[i + 1] = valueHolder;
        }
      }
    } while(swap);

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