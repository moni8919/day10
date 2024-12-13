import java.util.*;
public class lnklsthashset1 {
    public static void main(String[] args){
        LinkedHashSet<String>a=new LinkedHashSet<>();
        a.add("hello");
        a.add("hello");
        a.add("students");
        a.add("rajesh");
        a.add("students");
        System.out.print(a);
        a.remove("rajesh");
        System.out.print(a);
        a.clear();
        System.out.print(a);
    }
    
}