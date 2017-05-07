package simple.chapter05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_05_02_Repeat {

  public static void main(String[] args) {
    String s = " the url is http://www.forta.com/, to connect securely use"
        + " https://www.forta.com/ https://www.for-ta.com/ https://www.fo_rta.com/";

    Pattern p1 = Pattern.compile("\\bhttps?://[\\w/.-]+\\b");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
     
    s = "4/8/03 "
        + " 10-6-2004 "
        + " 2/2/2 "
        + " 01-01-01";
    
      p1 = Pattern.compile("\\b\\d{1,2}[-\\/]\\d{1,2}[-\\/]\\d{1,2}\\b");
      m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    
    
    s = "1001: $496.80 "
        + "1002: $1290.69 "
        + "1003: $26.43 "
        + "1004: $613.42 "
        + "1005: $7.61 "
        + "1006: $414.90 "
        + "1007: $25.00 " ;
    
      p1 = Pattern.compile("\\$\\d{3,}\\.?\\d*");
      m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
  }

}
