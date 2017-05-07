package simple.chapter04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_04_01_Meta {

  public static void main(String[] args) {
    String s = " var myArray = new Array()\n "
        + " .... \n"
        + " if(myArray[0] == 0)  \n"
        + "  myArray[1]  \n"
        + "  myArray[11]  \n"
        + "  myArray[i]  \n"
        + "}";

    Pattern p1 = Pattern.compile("myArray[0]");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    
    p1 = Pattern.compile("myArray\\[0\\]");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("myArray\\[[0-9]\\]");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("myArray\\[\\d+\\]");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("myArray\\[\\D+\\]");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    
    s = "11213 A1C2E3 48075 48237 M1B4F5 90046 H1H2H2" ;

    p1 = Pattern.compile("\\w\\d\\w\\d\\w\\d");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    s = "<BODY BGCOLOR=\"#336633\" TEXT=\"#FFFFFF\" "
        + "MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" TOPMARGIN=\"0\" LENGHTHMARGIN=\"0\">";

    p1 = Pattern.compile("#[0-9A-Fa-f]{6}");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
  }

}
