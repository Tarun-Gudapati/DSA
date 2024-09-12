import java.util.Arrays;

public class FindingEnergy{
public static void main(String[] args) {
  int arr[]={1,2,5,9};
  int threshold=6;
 
  System.out.println(findMinDiv(arr, threshold));

}

private static int findMinDiv(int[] arr, int threshold) {
  int result=-1;
  int left=1;
  int right=Arrays.stream(arr).max().getAsInt();
  while (left<=right) {

    int mid=left+(right-left)/2;
    int append=0;
    for(int i=0;i<arr.length;i++)
    {
      append+=(int)Math.ceil((double)arr[i]/ mid);
    }
    if (append<=threshold) {
      result=mid;
      right=mid-1;
      
    }
    else
    {
      left=mid+1;
    }

  }
  return result;
}
}