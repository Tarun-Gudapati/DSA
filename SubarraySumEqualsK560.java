public class SubarraySumEqualsK560 {
  public static void main(String[] args) {
    int []arr={1,1,1};
    int k=2;
    System.out.println(subarraySum(arr, k));
    int x=5;
  }

  private static int subarraySum(int[] arr, int k) {
    int m=0,sum=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==k)
        {
          m++;
          sum=0;
        }
        else{

          sum+=arr[i];
          if(sum==k)
          {
            m++;
            sum=0;

          }
        }
    }

  return m;
  }
}
