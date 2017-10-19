public class BinarySearch {

  // A binary search algorithm that takes in an int (number looking for) and
  // an int array (array where looking) and returns the index where number found
  // or returns -1 ASSUMES INPUT ARRAY IS IN ORDER
  
  public static int search(int num, int[] nums) {
    int startIndex = 0;
    int endIndex = nums.length - 1;
    do {
      int middle = (startIndex + endIndex) / 2; // Implicit casting will demote this to an integer and always round down (intentional)
      if (nums[middle] == num) {
        return middle;
      } else if (nums[middle] < num) {
        startIndex = middle + 1;
      } else {
        endIndex = middle - 1;
      }
    } while(startIndex <= endIndex);

    return -1;
  }

  public static void main(String[] args) {
    int[] test = {0,1,2,3,4,5,6,7};
    System.out.println(search(7, test));
  }
}