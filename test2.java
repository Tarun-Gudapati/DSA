import java.util.Scanner;
public class test2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println(reverseTheNumber(a));
    
sc.close();
  }

  private static int reverseTheNumber(int i) {
  int original=i;
  if (original<0) {
    original=-1*i;
  }
  String str=Integer.toString(original);
  char[] ch=str.toCharArray();
  String Reverse="";
  int last=1;
  for(int m=1;m<ch.length;m++)
  {
  if (ch[ch.length-m]=='0') {
    last++;
  }
  else{
    break;
  }
}
  
  
  for(int k=str.length()-last;k>=0;k--)
  {
  
      Reverse+=ch[k];
  }
  int end=Integer.parseInt(Reverse);
  if(i<0)
  {
   
    return -1*end ;
  }
  return end;
  }
}
