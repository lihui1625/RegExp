package simple.chapter09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_09_02_LookAround {

  public static void main(String[] args) {
    String s = " http://www.123.com "
        + " https://www.123.com "
        + " ftp://www.123.com ";
    

    Pattern p1 = Pattern.compile("\\w+(?=:)");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("\\w+(:)");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    s = " ABC01: $23.45 "
        + " HGGG: $5.31 "
        + " DFD: $345.53 "
        + " XTC99: $56.96 "
        + " Total items found: 4" ;
    

    p1 = Pattern.compile("\\b\\$[0-9.]+\\b");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("\\b(?<=\\$)[0-9.]+\\b");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("\\b(?<!\\$)[0-9.]+\\b");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
  }

}
