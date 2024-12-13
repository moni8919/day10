import java.util.*;
public class removing {
    public static void main(String[] args){
        HashMap<String,String>a=new HashMap<>();
        a.put("SNO","01");
        a.put("SName","muraja");
        a.put("City","chennai");
        System.out.println(a);
        {
            a.remove("SName");
            System.out.println(a);
            a.clear();
            System.out.println(a);
        }

    }
    
}
