package simple.chapter10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_10_02_Inject {

  public static void main(String[] args) {
    String s = " 11111 "
        + " 22222 "
        + " 33333-  "
        + " 44444-8888 ";

    Pattern p1 = Pattern.compile("\\b\\d{5}(-\\d{4})?\\b");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("\\b\\d{5}(?(?=-)-\\d{4})?\\b");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
     
    
  }

}
