package Collectionpractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("h");
		Map  m=new HashMap();
		m.put(5, "aa");
		m.put(3, "vv");
		System.out.println(m);
		
		
		
		
		Set<Integer> keys=m.keySet();
		System.out.println(keys);
		
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext())
		{
			int i=itr.next();
			System.out.println(i);
			
			
			String ss=(String)m.get(i);
			System.out.println(ss);
			
			
			
			
		}
	}

}
