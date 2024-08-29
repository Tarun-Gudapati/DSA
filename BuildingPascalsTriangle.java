public class BuildingPascalsTriangle {
    public static void main(String[] args) {
     build(4);
    }

    private static void build(int m) {

         int spaces =m,number=1;
         for(int i=0;i<m;i++)
         {
          for(int j=0;j<spaces;j++)
          {
            System.out.print( " ");
          }
          number=1;
          for(int k=0;k<=i;k++)
          {
            System.err.print(number+" ");
            number=number*(i-k)/(k+1);
          }
          spaces--;
          System.err.println();
         }
    }
}
