class Odd1903 {
  public static void main(String[] args) {
    String str="35427";
  System.out.println(findTheOdd(str));
  }

  private static String findTheOdd(String str) {
   int max=0;
   int result=0;
   int len=str.length();
   for(int i=0;i<len;i++)
   {
      max*=10;
      max+=str.charAt(i)-'0';
      if (!(max%2==0) && max>result) {
        result=max;
      }
   }
   if(result==0)return "";
   return Integer.toString(result);
  }
}
