package simple.chapter06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_06_01_StrBorder {

  public static void main(String[] args) {
    String s = " <?xml version='1.0' encoding='UTF-8' ?> "
        + " <wsdl:definitions targetNamespace='http://tips.cf'"
        + " xmlns:impl='http://tips.sf' xmlns:intf='http://tips.tf'"
        + " xmlns:apachesoap='http://xml.apache.org/xml-soap' "
        + " "
        + " "
        + "  ";

    Pattern p1 = Pattern.compile("^\\s*<\\?xml.*\\?>");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
    
    s = "this is bad "
        + " <?xml version='1.0' encoding='UTF-8' ?> "
        + " <wsdl:definitions targetNamespace='http://tips.cf'"
        + " xmlns:impl='http://tips.sf' xmlns:intf='http://tips.tf'"
        + " xmlns:apachesoap='http://xml.apache.org/xml-soap' "
        + " "
        + " "
        + "  ";

    p1 = Pattern.compile("^\\s*<\\?xml.*\\?>");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }

    s = " <?xml version='1.0' encoding='UTF-8' ?> "
        + " <wsdl:definitions targetNamespace='http://tips.cf'"
        + " xmlns:impl='http://tips.sf' xmlns:intf='http://tips.tf'"
        + " xmlns:apachesoap='http://xml.apache.org/xml-soap'/> "
        + " "
        + " "
        + " </xml> ";

    p1 = Pattern.compile("^\\s*<\\?xml.*\\?>.*</xml>\\s*$");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }

    s = " <?xml version='1.0' encoding='UTF-8' ?> "
        + " <wsdl:definitions targetNamespace='http://tips.cf'"
        + " xmlns:impl='http://tips.sf' xmlns:intf='http://tips.tf'"
        + " xmlns:apachesoap='http://xml.apache.org/xml-soap'/> "
        + " "
        + " "
        + " </xml>a ";

    p1 = Pattern.compile("^\\s*<\\?xml.*\\?>.*</xml>\\s*$");
    m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      System.out.println(m1.group());
    }
  }

}
