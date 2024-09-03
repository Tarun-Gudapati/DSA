package Recursion;

import java.util.Arrays;

public class BinarySearch {
  public static void main(String[] args) {
    int [] arr ={1,5,6,7,8,9,77};
    Arrays.sort(arr);
    int target=77;
    int low=0 ;
    int a=0;
    int high=arr.length-1;

    System.out.println( binarySearch(arr,target));
    System.out.println( recBinarySearch(arr,target,low,high));
  
  }

  private static int recBinarySearch(int[] arr, int target, int low, int high) {
  
  if(high<low)
  {
    return -1;
  }
    int mid =(low+high)/2;

  if(arr[mid]==target)
  return mid; 
  if(arr[mid]>target)
  {
    high=mid-1;
    return recBinarySearch(arr, target, low, high);
  }
  else
  {
  low=mid+1;
  return recBinarySearch(arr, target, low, high);
  }
  
  }

  private static int binarySearch(int[] arr, int target) {  
int low=0 ;
int high=arr.length-1;
int mid;
while(high>=low)
{
    mid=(high+low)/2;
    if (arr[mid]==target) {
      return mid;
      
    }
    else{
      if(arr[mid]>target)
      {
        high=mid-1;
      }
      else
      {
        low=mid+1;
      }
    }
}

   
   return -1;
  }
}
