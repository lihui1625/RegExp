package simple.chapter02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_02_02_AnyChar {

  public static void main(String[] args) {
    
    String s = " sales.xls sales1.xls order3.xls sales2.xls sales3.xls "
        + " apac1.xls europe2.xls na1.xls na2.xls sa1.xls";

    Pattern p1 = Pattern.compile("sales.");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor sales.");
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile(".a.");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor .a.");
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile(".a..");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor .a..");
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile(".a.\\.xls");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor .a.\\.xls");
    while (m1.find()) { 
      System.out.println(m1.group());
    }
  }

}
