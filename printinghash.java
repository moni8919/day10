import java.util.*;
public class printinghash {
    public static void main(String[] args){
        HashMap<String,String>a=new HashMap<>();
        a.put("SNO","01");
        a.put("SName","muraja");
        System.out.println(a);
        if(a.containsKey("SNO"));
        {
            String d=a.get("SName");
            System.out.println(d);
        }

    }
    
}
