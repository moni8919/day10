import java.util.*;
  public class str2 {
    public static void main(String args[]){
        String a1[]={"hello","manisha","mounika"};
        String a2[]={"hello","hi","hasini","mounika"};
        Set<String> a=new HashSet<>();
        Set<String> b=new HashSet<>();
        for(String s:a1)
        a.add(s);
        for(String s1:a2)
        b.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set<String> u=new HashSet<>(a);
        u.retainAll(b);
        System.out.println(u);

    }
    
}
