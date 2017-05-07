package regex.java.api;

import java.util.regex.Pattern;

public class Exam_11_01 {

  public static void main(String[] args) {
    System.out.println("1".matches("\\d"));
    System.out.println("1a".matches("\\d"));
    
    Pattern pattern = Pattern.compile("\\d");
    System.out.println(pattern.matcher("1").matches());
    System.out.println(pattern.matcher("1 a").matches());
    System.out.println(pattern.matcher("1 a").find());
  }

}
