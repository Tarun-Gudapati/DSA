public class SingleElementInSortedArray {
  public static void main(String[] args) {
    int arr[]={1,1,2,2,3,3,9,4,4,8,8};
    System.out.println(findSingle(arr));
    
  }

  private static int  findSingle(int[] arr) {
  int left=0;
  int right=arr.length-1;
  while(left<right)
  {
    int mid=(left+right)/2;
    if(mid%2==0 && arr[mid+1]==arr[mid] || mid%2==1 && arr[mid-1]==arr[mid])
    {
      left=mid+1;
    }
    else{
      right=mid;
    }
  }
  
    return arr[left];
  
  }
}
