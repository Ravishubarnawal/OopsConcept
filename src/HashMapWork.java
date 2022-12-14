import java.util.*;

public class HashMapWork {
    public static void main(String[] args) {
        HashMap<String, Integer> h1= new HashMap<>();
        h1.put("Naresh",130000);
        h1.put("Kanchan",200000);
        h1.put("RamBuddha",2000000);
        h1.put("Jagdish",100000);
        System.out.println(h1);
        h1.put("Jagdish",120000);
        System.out.println(h1);
        Set s= h1.keySet();
        System.out.println(s);
        Collection c = h1.values();
        System.out.println(c);
        h1.size();
        System.out.println(h1);
        Set s1= h1.entrySet();
        System.out.println(s1);
        Iterator itr= s1.iterator();
        while (itr.hasNext()){
            Map.Entry m1= (Map.Entry) itr.next();
            System.out.println(m1.getKey()+"........"+m1.getValue());
            if(m1.getKey().equals("Jagdish")){
                m1.setValue(115000);
                System.out.println(m1);
            }
        }
        System.out.println(h1);
    }
}
