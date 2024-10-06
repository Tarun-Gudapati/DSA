import java.util.Arrays;

public class KthMissingPositive {
  public static void main(String[] args) {
      int arr[]={2,3,4,7,11};
      int k=5;
     System.out.println( findKthPositive(arr,k));
      
  }
  public static int findKthPositive(int []arr,int k)
  {
   
    int last=arr[arr.length-1];
    int narr[]=new int [last];
    int a =5;
    for(int i=1;i<=last;i++)
    {
        narr[i-1]=i;
    }
    int left =arr[0];
    int right=arr[arr.length-1];
    int mid;
    boolean found=false;
    int increment =0;
   while (right>=left) {
    mid=left+(right-left)/2;
   


   
   }
    return 0;
  }

}
