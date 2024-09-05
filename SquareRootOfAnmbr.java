public class SquareRootOfAnmbr {
  public static void main(String[] args) {
    int k=92838;
    if(isPerfectSqr(k))
    {
      System.out.println(k+" is a perfect square");
    }
    else
    {
      System.out.println(k+" is not a perfect square");
    }
  }

  private static boolean isPerfectSqr(int k) {
    int low=1;
    int high=k;
    boolean b=false;
    while(high>=low)
    {
      int mid=(high+low)/2;
        if (mid*mid==k) {
          return true;
        }
        else if (mid*mid>k) {
          high=mid-1;
          
        }
        else{
          low=mid+1;
        }
    }
    return b;
    }
}
