 import java.util.*;
 public class acptingvalustohash{
    public static void main(String[] args){
        HashSet<String>a=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
          String s=sc.next();
          a.add(s);
          }System.out.println(a);
    }
}
