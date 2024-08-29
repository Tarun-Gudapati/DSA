public class MatrixRotation {


  public static void main(String[] args) {
    int [][]arr={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
   
    rotateBy90(arr);
    for (int[] is : arr) {
      for(int a:is)
      {
        System.out.print(a+" ");
      }
      System.out.println();
      
    }
  }

  private static void rotateBy90(int[][] arr) {
    int[][] nArr=new int[arr.length][arr[0].length];

    int arrRow=arr.length,arrCol=arr[0].length,nArrRow=nArr.length,nArrCol=nArr[0].length;
    for(int i=0;i<arrRow;i++)
    {
      for(int j=0;j<arrCol;j++)
      {
        nArr[j][(nArrCol-1)-i]=arr[i][j];
      }
    }
    changeMatrix(nArr,arr);
   
  }

  private static void changeMatrix(int[][] nArr, int[][] arr) {
    int arrRow=arr.length,arrCol=arr[0].length,nArrRow=nArr.length,nArrCol=nArr[0].length;
    for(int i=0;i<arrRow;i++)
    {
      for(int j=0;j<arrCol;j++)
      {
        arr[i][j]=nArr[i][j];
      }
    }
  }}
      
      
      
