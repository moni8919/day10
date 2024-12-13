import java.util.*;

public class iteratorlnklsthshset {
    public static void main(String[] args){
      LinkedHashSet<String>a= new LinkedHashSet<>();
      a.add("hello");
      a.add("hello");
      a.add("students");
      a.add("rajesh");
      a.add("students");
      System.out.print(a);
      for(String s:a)
      {
        System.out.print(s+" ");
      }
   }
}
