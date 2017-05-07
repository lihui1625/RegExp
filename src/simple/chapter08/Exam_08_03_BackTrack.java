package simple.chapter08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_08_03_BackTrack {

  public static void main(String[] args) {
    String s = "b@forta.com \n"
        + " ben@forta.com \n"
        + " b1forta@forta.com \n"
        + " b1.222forta@forta.com.cn \n"
        + " b1.222forta@.com.cn \n"
        + " b1.222forta@forta.com. \n"
        + " @forta.com \n"
        + " .@forta.com \n"
        + " sdsd.@forta.com \n"
        + " .ewrwe@forta.com \n";   

    Pattern p1 = Pattern.compile("(\\b\\w+(\\.\\w+)*@\\w+\\.\\w+(\\.\\w+)*\\b)");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("(?<mail>\\b\\w+(\\.\\w+)*@\\w+\\.\\w+(\\.\\w+)*\\b)");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      s = m1.replaceAll("<a href='mailto:${mail}'>mail to ${mail}</a>");
    }
    System.out.println("after replace:\n" + s);
    
    s = "313-555-1234 \n"
        + "248-345-3453 \n"
        + "870-323-5435";
    
    p1 = Pattern.compile("(?<n1>\\d{3})(?<n2>-\\d{3}-\\d{4})");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      s = m1.replaceAll("(${n1})${n2}");
    }
    System.out.println("after replace:\n" + s); 
    
    s = "313-555-1234 \n"
        + "248-345-3453 \n"
        + "870-323-5435";
    s = s.replaceAll("(?<n1>\\d{3})(?<n2>-\\d{3}-\\d{4})", "(${n1})${n2}");
    System.out.println("\n\nafter replace:\n" + s);
     
  }

}
