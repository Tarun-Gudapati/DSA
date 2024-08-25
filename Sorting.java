import java.util.Arrays;

public class Sorting {
  
  public static void main(String[] args) {
    int arr[] ={10,4,5,6,9,8,7,5,6,4,3,2,1};
    //System.out.println(SelectionSort(arr));
   // System.out.println(insertionSort(arr));
   System.out.println(bubbleSort(arr));
  }



private static String bubbleSort(int[] arr) {

for(int i=0;i<arr.length;i++)
{
for (int j=0;j<arr.length-1-i;j++)
{
  if (arr[j]>arr[j+1]) {
    swap(arr, j, j+1);
    
  }
}
}
String str=Arrays.toString(arr);


    return str;

   
  }




  public static String insertionSort(int[] arr) {
    for(int i=0;i<arr.length-1;i++)
    {
      for(int j=i+1;j>0;j--)
      {
          if (arr[j-1]>arr[j]) {
            swap(arr, j, j-1); 
          }

      } 

    }
    String str=Arrays.toString(arr);


    return str;
  }




  static String SelectionSort(int [] arr){
    for(int i=0;i<arr.length;i++)
    {
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[i]>arr[j])
        {
          swap(arr,i,j);
        }
      } 
    }
    String str=Arrays.toString(arr);
    return str;
      
  }

  static void swap(int [] arr,int  i, int j)
  {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }

  
}
