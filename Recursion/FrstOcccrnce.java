package Recursion;

import java.util.Arrays;

/**
 * FrstOcccrnce
 */
public class FrstOcccrnce {

    public static void main(String[] args) {
      int [] arr={5,7,7,8,8,10};
      int target=8;
      String str=Arrays.toString(targetArr(arr,target));
      System.out.println(str);
      
    }

    private static int[] targetArr(int[] arr, int target) {
    int opt[]={-1,-1};
    if(arr.length<1)
    {
      return opt;
    }
    int high=arr.length-1;
    int low=0;
  
    while (high>low) {
      int mid=(high+low)/2;

      if(arr[mid]==target)
      {
        opt[0]=mid;
        high=mid-1; 
        opt[1]=mid+1;
        return opt;

      }
      else if (arr[mid]>target) {
        high=mid-1;
      
      }
      else{
        low=mid+1;
      }
    }  
    return opt;
    }

  
}