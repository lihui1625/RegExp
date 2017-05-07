package simple.chapter06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_06_03_MultiLine {

  public static void main(String[] args) {
    String s = " <SCRIPT> \r\n" + " function doSpellCheck(form, filed) { \r\n"
        + "  //Make sure not empty \r\n" + " if (field.value == '') { \r\n"
        + "     return false; \r\n" + "  } \r\n" + " //Init \r\n"
        + " var windowName = 'spellWindow' ; \r\n"
        + " var spellCheckURL='spell.cfm?formname=comment&fieldname='+field.name; \r\n"
        + " //Done \r\n" + " return false; \r\n" + " } \r\n"
        + " </SCRIPT> \r\n";

    Pattern p1 = Pattern.compile("^\\s*//.*$");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }

    p1 = Pattern.compile("(?m)^\\s*//.*$");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }

  }

}
