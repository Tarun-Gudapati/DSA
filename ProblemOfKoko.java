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
     int max = Arrays.stream(arr).max().getAsInt();
     int mp=0;
   for(int i=1;i<=max;i++)
   {
    mp=gettingTemp(arr,i);
    if (mp<=target) {
      min=i;
      break;
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
