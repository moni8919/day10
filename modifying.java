import java.util.*;
public class modifying {
    public static void main(String[] args){
        HashMap<String,String>a=new HashMap<>();
        a.put("SNO","01");
        a.put("SName","muraja");
        a.put("City","chennai");
        System.out.println(a);
        {
            a.put("SNO","90");
            System.out.println(a);
        }

    }
    
}
