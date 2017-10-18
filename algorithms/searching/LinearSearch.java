public class LinearSearch {
  
  // Method that takes in an int (number looking for) and
  // an array (place where looking) and return the index
  // where the number was found or -1 if not found
  public static int search(int num, int[] nums) {
    int index = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == num) {
        index = i;
      }
    }
    return index;
  }
  public static void main(String[] args) {
    int[] test = {4,5,6,12,3,8,9,0};
    System.out.println(search(8, test));
  }
}