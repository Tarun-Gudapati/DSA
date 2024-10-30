public class MaximumSubarray {
  public static void main(String[] args) {
    int [] arr={2,3,-2,5,4};
    Solution mx=new Solution();
    System.out.println("the value is:"+mx.maxProduct(arr));
  }
}
/**
 * InnerMaximumSubarray
 */
class Solution {

  public int maxProduct(int[] nums) {
    
    int len=nums.length;
    int peak=nums[0]*nums[1];
    int product;
    for(int i=0;i<len;i++)
    {
      product=nums[i];
      peak=Math.max(peak, product);
        for(int j=i+1;j<len;j++)
        {
            product*=nums[j];
           peak=Math.max(peak, product);
        }
    }


    return peak;
  }

}