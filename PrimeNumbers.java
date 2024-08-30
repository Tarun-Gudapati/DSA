public class PrimeNumbers {
  public static void main(String[] args) {
    int a=100;
    for(int i=2;i<a;i++)
    {
      boolean b=true;
        for(int j=2;j<=Math.sqrt(i);j++)
        {
          if(i%j==0)
          {
            b=false;
          }
        }
        if (b) {
          System.err.print(i+" ");
          
        }
    }
  }
}
