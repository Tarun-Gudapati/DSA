import java.util.Arrays;

public class RotatingLeft {
  public static void main(String[] args) {
    // Rot r=new Rot();
    // int arr[]={1,2,3,4,5,6,7};
    // int k=3;
    // r.rotate(arr,k);
    // 
    int arr[]={0,12,0,0,7,0,8};
    moveZeroes(arr);
    for(int m:arr)
    {
      System.out.print(m+" ");
    }
  }
  public static void moveZeroes(int[] nums) {
    int zerCount=0;
    for(int i=0;i<nums.length;i++)
    {
      if(nums[i]==0)zerCount++;
      else
      {
        nums[i-zerCount]= nums[i];  
        
      }

    }
    int a=1;
    while(zerCount>0)
    {

      nums[nums.length-a]=0;
      a++;
      zerCount--;

    }
    
}
}
class Rot {
  public void rotate(int[] nums, int k) {
      for(int i=0;i<k;i++)//for iteration
      {
          int last =nums[nums.length-1];
          for(int j=nums.length-1;j>0;j--)
          {
              nums[j]=nums[j-1];
          }
          nums[0]=last;
      }
  }
}