public class Problem136SingleNumber {
public static void main(String[] args) {
 int  arr[] ={0,2,1,1,0,2,1};
  // int a=singleNumber(arr);
  // System.out.println(a);
  sortColors(arr);
  for (int i : arr) {
    System.out.print(i+" ");
  }
}
    public static int singleNumber(int[] nums) {
        int size=0,value=0;
        for(int i=0;i<nums.length;i++)
        { 
            value ^=nums[i];
        }
        return value;
    }
  
      public static void sortColors(int[] nums) {
          int z=0,One=0,Two=0;
          for(int i=0;i<nums.length;i++)
          {
              if(nums[i]==0)
              {
                  z++;
              }
              else if(nums[i]==1)
              {
                  One++;
              }
              else{
                  Two++;
              }
  
          }
          for(int i=0;i<nums.length;i++)
          {
             if(i<z)
             {
              nums[i]=0;
             }
               else if(i>=z)
             {
              nums[i]=1;
             }
              if(i>z+Two)
             {
              nums[i]=2;
             }
  
          }
      }
  
}
