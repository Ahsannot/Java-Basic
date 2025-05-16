import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList <Object>list = new ArrayList<Object>();
        list.add("Ahsan");
        list.add("Akmal");
        list.add("Ajmal");
        list.add("Azhar");
        list.add("Ahsan");
        list.add("Mudassar");
        list.add(548);
        list.add('C');
        list.add("ere");
        System.out.println(list);
        list.add(4,"Farrukh");
        System.out.println(list);
        System.out.println(list.get(6));
        list.set(6,"Atif");
        System.out.println(list);
        list.remove(9);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("Ehsan"));
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("---------------HashSet----------------");

        HashSet <Object> hs = new HashSet<Object>();
        hs.add("Ahsan");
        hs.add("Ajmal");
        hs.add("Akmal");
        hs.add("Ahsan");
        hs.add("Azhar");
        System.out.println(hs);
        System.out.println(hs.size());
        hs.add("Slaman");
        System.out.println(hs.size());
        System.out.println(hs);
        System.out.println("---------------HashSet to ArrayList----------------");
        ArrayList mylist = new ArrayList(hs);
        System.out.println(mylist);
        mylist.set(0, "Atif");
        System.out.println(mylist);
        System.out.println("---------------HashMap----------------");
        HashMap <Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "GCUF");
        hm.put(2, "GC Lahore");
        hm.put(3, "GC Okara");
        hm.put(4, "GCUL");
        System.out.println(hm.get(3));
//        update the value at 3
        hm.put(3, "GCT Okara"); 
        System.out.println(hm);
        hm.put(5, "GC Okara");
        System.out.println(hm);

        Iterator < Map.Entry<Integer, String>> ite = hm.entrySet().iterator();
        while (ite.hasNext()){
            Map.Entry<Integer, String> entry = ite.next();
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
    }
}
