import java.util.Arrays;

public class Problem2149 {
  public static void main(String[] args) {
    int [] nums={3,1,-2,-5,2,-4};
    rearrangeArray(nums);
    for (int i : nums) {
      System.out.print(i+" ");
    }
  }

  private static int[] rearrangeArray(int[] nums) {
    
{
  int arr1[]=new int[nums.length/2];
  int arr2[]=new int[nums.length/2];
  int a1=0;
  int a2=0;
  

  for(int i=0;i<nums.length;i++)
  {
    if(nums[i]>0)
    {
      arr1[a1]=nums[i];
      a1++; 
    }
    else{
      arr2[a2]=nums[i];
      a2++;
    }
  }
  a1=0;
  a2=0;
  for(int i=0;i<nums.length;i++)
  {
    if(i%2==0)
    {
      nums[i]=arr1[a1];
      a1++;
    }
    else{
      nums[i]=arr2[a2];
      a2++;
    }
  }

}
  return nums;
  }

  private static void exchng(int i, int k,int[] nums) {
    int temp= nums[0];
        nums[0]=nums[k];
        nums[k]=temp;
    }
}
