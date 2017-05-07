package simple.chapter05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_05_01_Repeat {

  public static void main(String[] args) {
    String s = "b@forta.com "
        + " ben@forta.com "
        + " b1forta@forta.com "
        + " b1.222forta@forta.com.cn "
        + " b1.222forta@.com.cn "
        + " b1.222forta@forta.com. "
        + " @forta.com "
        + " .@forta.com "
        + " sdsd.@forta.com "
        + " .ewrwe@forta.com ";

    Pattern p1 = Pattern.compile("\\b\\w@\\w\\.\\w\\b");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("\\b\\w+@\\w+\\.\\w+\\b");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("\\b\\w+[\\w.]*@[\\w+.]+\\.\\w+\\b");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
  
    p1 = Pattern.compile("\\b(\\w+|\\w+[\\w.]*\\w+)@\\w+[\\w.]+\\w+\\b");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    
    
  }

}
