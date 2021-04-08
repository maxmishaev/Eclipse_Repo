package maxmishaev.Lesson10;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest {
	
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
	    arrayList.add("A");
	    arrayList.add("B");
	    arrayList.add("C");
	    arrayList.add("D");
	    arrayList.add("E");
	    arrayList.add(1, "À0");
	    System.out.println(arrayList);
	    arrayList.remove("E");
	    arrayList.remove(2);
	    System.out.println(arrayList);
	    
	    List<Integer> list = new ArrayList<>();
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    Integer[] arr = new Integer[list.size()];
	    list.toArray(arr);
	    for(int a: arr) {
	    	System.out.print(" " + a);
	    }	
    	System.out.println();
	    
	    
	    	LinkedList<String> linkedList = new LinkedList<>();
	        linkedList.add("F");
	        linkedList.add("B");
	        linkedList.add("D");
	        linkedList.add("Å");
	        linkedList.add("C");
	        linkedList.addLast("Z");
	        linkedList.addFirst("A");
	        linkedList.add(1, "À2");
	        System.out.println("1. linkedList: " + linkedList);
	        linkedList.remove("F");
	        linkedList.remove(2);
	        System.out.println("2. linkedList: " + linkedList);
	        linkedList.removeFirst();
	        linkedList.removeLast();
	        System.out.println("3. linkedList: " + linkedList);
	        String val = linkedList.get(2);
	        linkedList.set(2, val + " èçìåíåíî");
	        System.out.println("4. linkedList: " + linkedList);
	        
	        HashMap<String, String> hm = new HashMap<>();
	        hm.put("Russia", "Moscow");
	        hm.put("France", "Paris");
	        hm.put("Germany", "Berlin");
	        hm.put("Norway", "Oslo");
	        for (Map.Entry<String, String> o : hm.entrySet()) {
	            System.out.println(o.getKey() + ": " + o.getValue());
	        }
	        hm.put("Germany", "Berlin2");
	        System.out.println("New Germany Entry: " + hm.get("Germany"));
	        
	        
	        Set<String> set = new HashSet<>();
	        set.add("Aëüôa");
	        set.add("Áåòà");
	        set.add("Aëüôa");
	        set.add("İòa");
	        set.add("Ãaììa");
	        set.add("İïñèëîí");
	        set.add("Oìeãa");
	        set.add("Ãaììa");
	        System.out.println(set);
	        
	        Set<String> ts = new TreeSet<String>();
	        ts.add("C");
	        ts.add("A");
	        ts.add("B");
	        ts.add("E");
	        ts.add("F");
	        ts.add("D");
	        System.out.println(ts);
	        
	        List<String> lst = new ArrayList<>(Arrays.asList("A", "B", "C", "C", "A", "A", "B", "C", "B"));
	        Iterator<String> iter = lst.iterator();
	        while (iter.hasNext()) {
	            String str = iter.next();
	            if (str.equals("A")) {
	                iter.remove();
	            }
	        }
	        System.out.println(lst);   
	        
	       /* //Ğàáîòà ñ êëàññîì Cat
	        List<Cat> cats = new ArrayList<>(Arrays.asList(
	                new Cat("A", 5), new Cat("B", 2), new Cat("C", 4)
	        ));
	        System.out.println(cats);
	        Collections.sort((List<T>) cats);
	        System.out.println(cats);

*/


	}


}
