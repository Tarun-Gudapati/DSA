package Recursion;

public class printFor5Times {
  public static void main(String[] args) {
    name(5);
  }

  private static void name(int i) {
   
    System.out.print("hello" +" ");
    i--;
    if(i> 0)
    {
     name(i);
    }
  }
}
