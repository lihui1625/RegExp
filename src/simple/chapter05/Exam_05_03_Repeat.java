package simple.chapter05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_05_03_Repeat {

  public static void main(String[] args) {
    String s = " This offer is not avialable to customer living in "
        + " <b>AK</B> and <B>HI</b>. ";

    Pattern p1 = Pattern.compile("<[Bb]>.*</[Bb]>");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("<[Bb]>.*?</[Bb]>");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
  }

}
