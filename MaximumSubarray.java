public class MaximumSubarray {
  public static void main(String[] args) {
    int [] arr={2,3,-2,4};
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
      peak=(product>peak)?product:peak;
        for(int j=i+1;j<len;j++)
        {
            product*=nums[j];
            peak=(product>peak)?product:peak;
        }
    }


    return peak;
  }

}