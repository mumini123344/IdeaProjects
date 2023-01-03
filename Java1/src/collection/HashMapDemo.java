package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        //HashMap m = new HashMap();
        HashMap<Integer, String> m = new HashMap<>();

        m.put(1, "John");
        m.put(2, "David");
        m.put(3, "Scott");
        m.put(4, "Mary");
        m.put(5, "Matt");
        m.put(6, "David");

        System.out.println(m);//{1=John, 2=David, 3=Scott, 4=Mary, 5=Matt}

        System.out.println(m.get(3));//Scott

        m.remove(6);//remove pair from hashmap
        //System.out.println(m);

        System.out.println(m.containsKey(1));//true
        System.out.println(m.containsKey(6));//false

        System.out.println(m.containsValue("GEO"));//false
        System.out.println(m.containsValue("John"));//true

        System.out.println(m.isEmpty());//false

        System.out.println(m.keySet());//returns all the keys as set collection
        for (Object i:m.keySet()){
            System.out.println(i);
        }
        //System.out.println(m.values());//returns all the values as a collection
        for (Object i:m.values()){
            System.out.println(i);
        }

//        for (Object i:m.keySet()){
//            System.out.println(i+"    "+m.get(i));
//        }
        //those two doing the same
//        // Entry methods
//        for (Map.Entry entry:m.entrySet()){
//            System.out.println(entry.getKey()+"     "+entry.getValue());
//
//        }
        //System.out.println(m.entrySet());//returns all the entries as set

        //iterator()
        Set s = m.entrySet();

        Iterator itr = s.iterator();
        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry) itr.next();//one entry will be returned
            System.out.println(entry.getKey()+"     "+entry.getValue());

        }



    }
}
