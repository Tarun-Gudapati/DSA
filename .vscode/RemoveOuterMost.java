/**
 * RemoveOuterMost
 */
public class RemoveOuterMost {

  public static void main(String[] args) {
    String str= "(()())(())";
    RemoveOuterMost obj=new RemoveOuterMost(str);
  }
  RemoveOuterMost(String str)
{
String res=""; 
int count =0;
for(int i=0;i<str.length();i++)
{
  char ch=str.charAt(i);
  if(ch=='(')
  {
    if(count>0)
    {
      res+=ch;
    }
    count++;
  }
  else if(ch==')')
  {
    count--;
    if(count>0)
    {
      res+=ch;
    }
  }
}
System.out.println("the result is" + res);
}
}