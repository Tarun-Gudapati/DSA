package Recursion;

public class Pattern {
  public static void main(String[] args) {
    int arr[][]=new int [9][9];
    for(int i=0;i<arr.length;i++)
    {
      for (int j = 0; j < arr.length; j++) {
        if(i==j || j==0||j==arr.length-1||i+j==arr.length-1)
        {
            System.out.print("*"+" ");
        }
        else
        {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
