public class Problem136SingleNumber {
public static void main(String[] args) {
  int  arr[] ={10,12,4,10,12,4,5};
  int a=singleNumber(arr);
  System.out.println(a);
}
    public static int singleNumber(int[] nums) {
        int size=0,value=0;
        for(int i=0;i<nums.length;i++)
        { 
            value ^=nums[i];
        }
        return value;
    }
}
