package simple.chapter08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_08_02_BackTrack {

  public static void main(String[] args) {
    String s = " this is a block of text, several words here are are "
        + " repeated, and and they should not by ";
    

    Pattern p1 = Pattern.compile("\\s+(\\w+)\\s+\\1");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
      System.out.println(m1.toMatchResult());
    }
    
    p1 = Pattern.compile("\\s+(?<word>\\w+)\\s+\\1");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
      System.out.println(m1.toMatchResult());
    }
    
  }

}
