import java.lang.reflect.Array;
import java.util.Arrays;

public class numberOfBoque {
  public static void main(String[] args) {
    int[] bloomDay={7,7,7,7,12,7,7};
    int achieve=minDays(bloomDay, 2, 3);
    System.out.println(achieve);
  }
  public static int minDays(int[] bloomDay, int m, int k) {
    int prd=m*k;
    int days=bloomDay.length;
   

    if(prd>bloomDay.length)
    return -1;
    int max=Arrays.stream(bloomDay).max().getAsInt();



    for(int i=1;i<=max;i++)
    {
      int flowers=0;
      int bouquets=0;


      for(int j=0;j<days;j++)
      {
        
      if(i>=bloomDay[j])
      {
        flowers++;
      }
      else
      {
        flowers=0;
      }
      if (flowers==k) {
        
        bouquets++;
        flowers=0;
      
      }
      if (bouquets==m) {
        return i;
      }
      }
    }
    return -1;
    }
}
