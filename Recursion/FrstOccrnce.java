package Recursion;



class FrstOccrnce {
  public static int[] searchRange(int[] nums, int target) {
      int high = nums.length - 1;
      int low = 0;
      int[] srr = {-1, -1};
      int mid;

      // Find the starting index of the target
      while (high >= low) {
          mid = (high + low) / 2;
          if (nums[mid] == target) {
              srr[0] = mid;
              high = mid - 1;  // Search on the left side
          } else if (nums[mid] > target) {
              high = mid - 1;
          } else {
              low = mid + 1;
          }
      }

      // Reset the search range
      high = nums.length - 1;
      low = 0;

      // Find the ending index of the target
      while (high >= low) {
          mid = (high + low) / 2;
          if (nums[mid] == target) {
              srr[1] = mid;
              low = mid + 1;  // Search on the right side
          } else if (nums[mid] > target) {
              high = mid - 1;
          } else {
              low = mid + 1;
          }
      }

      return srr;
  }

  public static void main(String[] args) {
      FrstOcccrnce solution = new FrstOcccrnce();

      // Example test case 1
      int[] nums1 = {5, 7, 7, 8, 8, 10};
      int target1 = 8;
      int[] result1 = searchRange(nums1, target1);
      System.out.println("Result for target " + target1 + ": [" + result1[0] + ", " + result1[1] + "]");

      // Example test case 2
      int[] nums2 = {5, 7, 7, 8, 8, 10};
      int target2 = 6;
      int[] result2 = searchRange(nums2, target2);
      System.out.println("Result for target " + target2 + ": [" + result2[0] + ", " + result2[1] + "]");

      // Example test case 3
      int[] nums3 = {};
      int target3 = 0;
      int[] result3 = searchRange(nums3, target3);
      System.out.println("Result for target " + target3 + ": [" + result3[0] + ", " + result3[1] + "]");

      // Example test case 4
      int[] nums4 = {1};
      int target4 = 1;
      int[] result4 = searchRange(nums4, target4);
      System.out.println("Result for target " + target4 + ": [" + result4[0] + ", " + result4[1] + "]");
  }
}
