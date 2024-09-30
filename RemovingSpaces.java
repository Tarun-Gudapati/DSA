
public class RemovingSpaces {

  public static void main(String[] args) {
    System.out.println(reverseWords(" hi  hoe are you "));
  }


  public static String reverseWords(String s) {
    // int len=s.length();
    //   String[] ch=new String[len];
    //   int i=0;
    //   int k=0;
    s=s.trim();
    String[] words=s.split("\\s+");
      // while (i<len) {
      //   if (s.indexOf(i)!=" ") {
      //     ch[k]=s.charAt(i);
      //     k++;
      //   }
      //   i++;
      // }
      StringBuilder reversed=new StringBuilder();
      for (int i = words.length - 1; i >= 0; i--) {
        reversed.append(words[i]);
        if (i != 0) {
          reversed.append(" "); // Add space between words
        }
      }
  
      return reversed.toString();
  }
}