package simple.chapter10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_10_01_Inject {

  public static void main(String[] args) {
    String s = " 123-456-7890 \r\n"
        + " (123)456-7890 \r\n"
        + " (123)-456-7890 \r\n"
        + " (1234567890 \r\n"
        + " 1234567890 \r\n"
        + " 123 456 7890 \r\n"
        + " 123-456-(7890) \r\n"
        + " (123)(456)(7890) \r\n"
        + " 123-456(7890) ";
    

    Pattern p1 = Pattern.compile("(?m)((\\(\\d{3}\\))|(\\d{3}-))\\d{3}-\\d{4}");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    
    p1 = Pattern.compile("(?m)(\\()\\d{3}(?(1)\\)|-)\\d{3}-\\d{4}");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
     
    
  }

}
