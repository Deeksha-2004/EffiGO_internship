package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class collection2 {

	public static void main(String[] args) {
		HashSet myset=new HashSet();
//		Set myset=new HashSet();
//		HashSet<String>myset=new HashSet<String>();
		
		
		myset.add(100);
		myset.add("Deeksha");
		myset.add(10.5);
		myset.add(true);
		myset.add('A');
		myset.add(null);
		myset.add(null);
		System.out.println(myset);
		System.out.println("Size of hashset:"+myset.size());
		myset.remove(10.5);
		
		System.out.println("After removing:"+myset);
		
		ArrayList al=new ArrayList(myset);
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		
		//using iterator
		
		Iterator it=myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		myset.clear();
		
		System.out.println(myset.isEmpty());
		
		
	}

}
