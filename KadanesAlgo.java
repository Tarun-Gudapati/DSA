//problem number 53 MAximum subarray

public class KadanesAlgo {
  public static void main(String[] args) {
    int [] arr={-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(arr));

  bnm,.;
  }

  private static int maxSubArray(int[] arr) {

    int sum=Integer.MIN_VALUE,count=arr[0];
    for(int i=1;i<arr.length;i++)
    { 
      count =Math.max(arr[i], count+arr[i]);
      sum=Math.max(count, sum);
    }
    return sum;
  }
  
}
