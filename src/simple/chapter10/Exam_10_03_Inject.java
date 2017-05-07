package simple.chapter10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_10_03_Inject {

  public static void main(String[] args) {
    String s = " <TD>"
        + " <a> <img src='aaa'> </a>"
        + " <img src='bbb'> "
        + " <a> <img src='ccc'> </a> "
        + " <img src='ddd'> "
        + " <a> <img src='eee'> </a> "
        + " <img src='fff'> " 
        + "  </TD> ";
    

    Pattern p1 = Pattern.compile("(<[Aa]\\s+[^>]*>\\s)?<[Ii][Mm][Gg]\\s+[^>]+>(?(1)\\s*</[Aa]>)");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
     
    
  }

}
