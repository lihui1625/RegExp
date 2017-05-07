package regex.java.api;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_11_03 {

  public static void main(String[] args) {
    String url = "http://LOCALHOST:8080/odata/v4/test/User,Attachment/User?$format=json&$fiter=userId ne 'aaa'";

    Pattern p = Pattern.compile("(?<protocol>http:|https:)/+(?<host>\\w+):(?<port>\\d*)/odata/v4/(?<category>internal/|restricted/|test/|)(?<dynamic>[\\w,]+/|)(?<entity>[^?]+)\\??(?<param>.*)");

    Matcher matcher = p.matcher(url);

    System.out.println("matches:" + url.matches(p.pattern()));
    System.out.println("matches:" + matcher.matches());
    if (matcher.find()) { 
      System.out.println("find: true");
      System.out.println("groupCount:  " + matcher.groupCount()); 
      for(int i=1;i<=matcher.groupCount();i++){
        System.out.println( "group" + i + ":  " +matcher.group(i));
      }
      System.out.println("group protocol:  "+matcher.group("protocol"));
      System.out.println("group host:  "+matcher.group("host")); 
      System.out.println("group port:  "+matcher.group("port")); 
      System.out.println("group category:  "+matcher.group("category"));
      System.out.println("group dynamic:  "+matcher.group("dynamic"));
      System.out.println("group entity:  "+matcher.group("entity"));
      System.out.println("group param:  "+matcher.group("param"));
      System.out.println("all group:  "+matcher.group());
    }
    System.out.println(url.replaceAll("(?<protocol>http:|https:)/+(?<host>\\w+)","ftp://${host}"));

  }
  

}
