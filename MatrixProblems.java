public class MatrixProblems {
  public static void main(String[] args) {
   int [][]matrix={{1,1,1},{1,0,1},{1,1,1}};
   setZeros(matrix);
   for(int []rw:matrix )
    {
        for(int m:rw)
        {
          System.out.print(" "+m+" ");
        }
        System.out.println(" ");
    }
  }





  static void setZeros(int [][]matrix){

    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j]==0)
            {
                changeRow(i,matrix);
                changeCol(j,matrix);
            }
        }
    }
    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j]==-1)
            {
               matrix[i][j]=0;
            }
        }
    }


  }




  private static void changeCol(int j, int[][] matrix) {
    for(int i=0;i<matrix.length;i++ )
    {
        if(matrix[i][j]!=0)
        {
          matrix[i][j]=-1;
        }
    }
  }




  private static void changeRow(int i,int[][]matrix) {
    for(int j=0;j<matrix[0].length;j++ )
    {
        if(matrix[i][j]!=0)
        {
          matrix[i][j]=-1;
        }
    }
  }




}