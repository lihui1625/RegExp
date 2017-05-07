package simple.chapter08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_08_04_BackTrack {

  public static void main(String[] args) {
    String s = " <BODY> "
        + " <H1> H1 contont1 </H1> "
        + " <H1> H1 contont2 </H1> "
        + " <H2> H2 contont1 </H2> "
        + " hhhhhhhh "
        + " <H2> H2 contont2 </H2> "
        + " <H2> error tag contont2 </H3> "
        + " <H21> h21 contont2 </H21> "
        + " jjjjjjjj "
        + "</BODY>";
    

    Pattern p1 = Pattern.compile("(?<tagstart><[Hh]\\d+>)(?<content>.*?)(?<tagend></[Hh]\\d+>)");
    Matcher m1 = p1.matcher(s);
    System.out.println("\n\nfor " + p1.toString());
    while (m1.find()) {
      s = m1.replaceAll("${tagstart}\\U${content}\\E${tagend}");
    }
    System.out.println("after replace:\n" + s);    
      
     
  }

}
