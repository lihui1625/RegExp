package simple.chapter01;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

public class PrintUtil {

  public static void printResult(MatchResult result) { 
    System.out.println("---------------------------------"); 
    System.out.println("group: " + result.group());
    System.out.println("start: " + result.start());
    System.out.println("end: " + result.end());
    System.out.println("detail: " + result.end());
    System.out.println("  groupCount: " + result.groupCount());
    for (int i = 0; i <= result.groupCount(); i++) {
      System.out.println("  groupIndex " + i + ": " + result.group(i));
      System.out.println("  startIndex " + i + ": " + result.start(i));
      System.out.println("  endIndex " + i + ": " + result.end(i));
    }
    System.out.println("---------------------------------");
  }

}
