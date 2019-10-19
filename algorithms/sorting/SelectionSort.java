import java.util.Arrays;

public class SelectionSort {
  public static void main (String[] args) {
    int[] nums = {100,50,40,30,20,10,1,0};
    System.out.println("Original: " + Arrays.toString(nums));
    selectionSort(nums);
    System.out.println("Sorted: " + Arrays.toString(nums));
  }

  public static void selectionSort (int[] nums) {
    int head = 0;
    int smallest_index;

    while (head != nums.length - 1) {
      smallest_index = head;

      for (int i = head; i < nums.length; i++) {
        if (nums[i] < nums[smallest_index])
          smallest_index = i;
      }

      if (smallest_index != head) {
        int hold = nums[head];
        nums[head] = nums[smallest_index];
        nums[smallest_index] = hold;
      }

      head++;
    }
  }
}