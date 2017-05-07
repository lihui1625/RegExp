package simple.chapter02;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import simple.chapter01.PrintUtil;

public class Exam_02_01_PureText {

  public static void main(String[] args) {

    String s = "Hello, my name is Ben. Please visit my website at http://www.forta.com/";

    Pattern p1 = Pattern.compile("Ben");
    Matcher m1 = p1.matcher(s);
    while (m1.find()) { 
      PrintUtil.printResult(m1.toMatchResult());
    }

    Pattern p2 = Pattern.compile("my");
    Matcher m2 = p2.matcher(s);
    while (m2.find()) {
      PrintUtil.printResult(m2.toMatchResult());
    }

  }

}
