public class BestTimeToBuyAStock121 {
  public static void main(String[] args) {
    int arr[]={4,5,6,7,1,9,8,11};
        //System.out.println(maxProfitBrt(arr));
    System.out.println(maxProfit(arr));
  }
  //kadanes algo
private static int maxProfit(int[] arr) {
  int buy=arr[0],profit=0;
  for (int i = 0; i < arr.length; i++) {
    buy=Math.min(arr[i], buy);
    int a=5;
    profit=Math.max(profit, arr[i]-buy);
  }

  return profit;
}

  //brute force 
  private static int maxProfitBrt(int[] arr) {
    int profit=0,max=0;
      for(int i=0;i<arr.length-1;i++)
      {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]<arr[j])
            {
              profit=arr[j]-arr[i];
              max=Math.max(max, profit);
            }
        }
      }
    return max;
    }


}
