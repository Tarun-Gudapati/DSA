public class MatrixProblems {
  public static void main(String[] args) {
    int mat[][]=new int[3][4];
    for(int i=0;i<mat.length;i++)
    {
      for(int j=0;j<mat[i].length;j++)
      {
        mat[i][j]=i+j;
      }
    }
    for(int []rw:mat )
    {
        for(int m:rw)
        {
          System.out.print(m+" ");
        }
        System.out.println(" ");
    }
  }
}
