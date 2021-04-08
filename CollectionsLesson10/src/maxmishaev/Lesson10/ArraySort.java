package maxmishaev.Lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArraySort {

	public static void main(String[] args) {
				
		ArrayList<String> arr = new ArrayList<>(Arrays.asList("Храм", "Двадцать", "Государство", "История", "Истерика", "Человек", "Чайник",
				"Шестьдесят", "История", "Государство", "Двадцать", "Чайник", "Государство",
				"История", "Век", "Буратино", "Эволюция", "Истерика", "Радио", "Телевидение"));
		
		Set<String> st = new HashSet<>();
		HashMap<String,Integer> hm = new HashMap<>();
		
		for(String a: arr) {
			st.add(a);				
			
		}
		
		System.out.println("Выводим список неповторяющихся слов:");
		System.out.println(st);
		
		/*
		
		Iterator<String> iter = arr.iterator();
		for(String a: arr) {
			while (iter.hasNext()) {
				String str = iter.next();
				if (str.equals(a)) { 
					hm.put(str,)
				}
			}
		}
	*/
	}

}
