public class adding {
 public static void main(String[] args) {
  int arr[]={5,6,2,0,0,4,6,2,4,9};
 int sol[]= plusOne(arr);
 for(int i:sol)
 {
  System.out.print(i);
 }
 }
    public static int[] plusOne(int[] digits) {
        
        if(digits[digits.length-1]<9)
        {
            digits[digits.length-1]++;
                return digits;
        }
        if(digits[digits.length-1]==9 && digits[digits.length-1]<9 )
        {
            digits[digits.length-1]=0;
             digits[digits.length-2]++;
                return digits;
        }
            int x=0;
            
            for(int i:digits)
            {
                x*=10;
                x+=i;
            }
            x++;
            String str=Integer.toString(x);
            int len=str.length();
            int newArr[]=new int [len];
            for( int m=len-1;m>=0;m--)
            {
              int r=x%10;
              x=x/10;
              newArr[m]=r;
            }
        return newArr;
       
    }
}

