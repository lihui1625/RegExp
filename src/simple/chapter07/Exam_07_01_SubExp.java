package simple.chapter07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import simple.chapter01.PrintUtil;

public class Exam_07_01_SubExp {

  public static void main(String[] args) {
    String s = " hello &nbsp; my name is &nbsp;&nbsp; ben &nbsp;&nbsp;&nbsp;&nbsp;";
         

    Pattern p1 = Pattern.compile("(&nbsp;){2,}");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    s = "Pinging from 10.34.53.55 110.34.53.55  10.334.53.55  10.34.256.55  10.34.53.256 with 10ms";
    

    p1 = Pattern.compile("(\\d{1,3}\\.){3}\\d{1,3}");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    p1 = Pattern.compile("((\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])\\.){3}(\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    s = "ID: 042 "
        + "SEX: M "
        + "DOB: 1967.08.07 "
        + "Status: Active ";
    
    p1 = Pattern.compile("(19|20)\\d{2}");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
  }

}
