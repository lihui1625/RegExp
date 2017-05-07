package simple.chapter08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_08_01_BackTrack {

  public static void main(String[] args) {
    String s = " <BODY> "
        + " <H1> H1 contont1 </H1> "
        + " <H1> H1 contont2 </H1> "
        + " <H2> H2 contont1 </H2> "
        + " hhhhhhhh "
        + " <H2> H2 contont2 </H2> "
        + " <H2> error tag contont2 </H3> "
        + " <H21> h21 contont2 </H21> "
        + " jjjjjjjj "
        + "</BODY>";
    

    Pattern p1 = Pattern.compile("<[Hh]1>.*</[Hh]1>");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("<[Hh]1>.*?</[Hh]1>");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("<[Hh]\\d>.*</[Hh]\\d>");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("<[Hh]\\d>.*?</[Hh]\\d>");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("<([Hh]\\d+)>.*?</\\1>");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
  }

}
