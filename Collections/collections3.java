package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class collections3 {

	public static void main(String[] args) {
		//HashMap hm=new HashMap();
		//Map hm=new HashMap();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101,"Deeksha");
		hm.put(102,"Aarav");
		hm.put(103,"Deepthi");
		hm.put(104,"Akshay");
		hm.put(102,"Suraj");
		System.out.println(hm);
		
		System.out.println("Size of hashmap:"+hm.size());
		
		hm.remove(104);
		
		System.out.println("After removing pair:"+hm);
	
		System.out.println(hm.get(102));
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());
		//using iterator
		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		hm.clear();
		System.out.println(hm.isEmpty());
	}

}
