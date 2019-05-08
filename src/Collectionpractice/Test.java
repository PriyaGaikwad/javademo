package Collectionpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>mh=new ArrayList<>();
		mh.add("pune");
		mh.add("mumbai");
		
		List<String>jh=new ArrayList<>();
		jh.add("ranchi");
		jh.add("loha");
		
		List<List<String>>India=new ArrayList();
		India.add(mh);
		India.add(jh);
		
		List<String>melban=new ArrayList();
		melban.add("aa");
		melban.add("bb");
		
		List<String>ketuki=new ArrayList();
		ketuki.add("CC");
		ketuki.add("dd");
		
		List<List<String>>Australia=new ArrayList();
		Australia.add(melban);
		Australia.add(ketuki);
		
		List<List<List<String>>>world=new ArrayList();
		world.add(India);
		world.add(Australia);
		
		for(List<List<String>>country:world)
		{
			for(List<String>state:country)
			{
				for(String city:state)
				{
					System.out.println(city);
				}
			}
		}
		/*Iterator<List<List<String>>>itr=world.iterator();
		while(itr.hasNext())
		{
			List<List<String>>country=itr.next();
			
			Iterator<List<String>>itr1=country.iterator();
			while(itr1.hasNext())
			{
				List<String>state=itr1.next();
				
				Iterator<String>itr2=state.iterator();
				while(itr2.hasNext())
				{
					String city=itr2.next();
					System.out.println(city);
				}
				
			}
			
		}*/
		
}
}
