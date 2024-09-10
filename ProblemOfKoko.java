import java.util.Arrays;

public class ProblemOfKoko {
  public static void main(String[] args) {
    int arr[]={30,11,23,4,20};
    int target=5;
    int a =findMin(arr,target);
    System.out.println(a);
  }

  private static int findMin(int[] arr, int target) {
   int min =0;
     int right = Arrays.stream(arr).max().getAsInt();
     int mp=0;
    int left=1;
     while (right>=left) {
      int mid=(left+right)/2;
      mp=gettingTemp(arr,mid);
      if (mp<=target) {
        min=mid;
        right=mid-1;
      }
      else {
        // If it takes more than target hours, increase the speed
        left = mid + 1;
      
     }
 

   }
  return min;
  }

  private static int gettingTemp(int[] arr, int i) {
    int temp=0;
  for(int j=0;j<=arr.length-1;j++) 
      {
        if (arr[j]<=i) {
          temp+=1;
          
        }
        else{
        double d=(double)arr[j];
        temp+=(int)Math.ceil(d/i);
        }
      }
      return temp;
  }
}
