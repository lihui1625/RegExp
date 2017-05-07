package simple.chapter06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_06_01_Border {

  public static void main(String[] args) {
    String s = " the cat scattered cate caty: bcat, concat. ";

    Pattern p1 = Pattern.compile("cat");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }

    p1 = Pattern.compile("\\bcat\\b");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }

    
    p1 = Pattern.compile("\\bcat");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("cat\\b");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("\\b.+\\b");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("\\b[^\\s]+?\\b");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    s = "a-b  b -c  c- d e - f ";
    p1 = Pattern.compile("\\B-\\B");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group() + " : " + m1.start() + "->" + m1.end()); 
    }
  }

}
