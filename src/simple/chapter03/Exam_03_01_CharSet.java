package simple.chapter03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_03_01_CharSet {

  public static void main(String[] args) {
    
    String s = " sales.xls sales1.xls order3.xls sales2.xls sales3.xls "
        + " apac1.xls europe2.xls na1.xls na2.xls sa1.xls usa1.xls sam.xls";

    Pattern p1 = Pattern.compile("[ns]a.\\.xls");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    
    s = " The phrase \"regular expression\" is often "
        + " abbreviated as RegEx or regex.";

    p1 = Pattern.compile("[Rr]eg[Ee]x");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    s = " sales.xls sales1.xls order3.xls sales2.xls sales3.xls "
        + " apac1.xls europe2.xls na1.xls na2.xls sa1.xls usa1.xls sam.xls";

    p1 = Pattern.compile("[ns]a[0-9]\\.xls");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("[ns]a[^0-9]\\.xls");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    s = "<BODY BGCOLOR=\"#336633\" TEXT=\"#FFFFFF\" "
        + "MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" TOPMARGIN=\"0\" LENGHTHMARGIN=\"0\">";

    p1 = Pattern.compile("#[0-9a-zA-Z]{6}");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) { 
      System.out.println(m1.group());
    }
    
    
  }

}
