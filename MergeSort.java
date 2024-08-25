public class MergeSort {
  public static void main(String[] args) {
   
  int arr[] ={10,12,4,5,6,5,7,4,3,2,1,9,8};
  mergeSort(arr);
  for(int a:arr)
  {
    System.out.print(a+" ");
  } 
  }

  private static void mergeSort(int[] arr) {
    int length=arr.length;
    if(length<=1)
    return;
    int middle=length/2;
    int [] leftArray=new int[middle];
    int [] rightArray= new int[length-middle];
    int i=0;
    int j=0;
    for(;i<length;i++)
    {
      if(i<middle){
      leftArray[i]=arr[i];
         }     
         else{
      rightArray[j]=arr[i];
    j++;}
    }
    mergeSort(leftArray);
    mergeSort(rightArray);
    merge(leftArray, rightArray, arr);
    
  }
  private static void merge(int[] leftArray ,int[] rightArray,int []arr)
  {
    int leftLength=leftArray.length,rightLength=rightArray.length;
    int i=0,l=0,r=0;
    while(r<rightLength && l<leftLength)
    {
      if (leftArray[l]<rightArray[r]) {
        arr[i]=leftArray[l];
        i++;
        l++;
        
      }
      else{
        arr[i]=rightArray[r];
        i++;
        r++;
      }
    }
    while (l<leftLength) {
      arr[i]=leftArray[l];
      i++;
      l++;
      
    }
    while (r<rightLength) {
      arr[i]=rightArray[r];
      i++;
      r++;
      
    }

    
  }
   
}
