package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet h=new LinkedHashSet();
		h.add("velocity");
		h.add(1);
		h.add('b');
		h.add(null);		//multiple null values are not allowed only 1 allowed
		h.add("Pune");
		h.add('B');  		//does not allows duplicates value
		h.add('B');
		h.add(null);
		h.add(123.321);	//any type of number is allowed
		h.add(99233879112L);//after 9 digit use L for long
		
		System.out.println(h);//order insertion is maintain  & no default capacity
		System.out.println(h.size());//storage type: hashtable +linear
		h.remove('B');//sets can remove characters list can't so that by using object method
		System.out.println(h);
		System.out.println(h.isEmpty());
		System.out.println(h.contains(null));
		
		System.out.println("===========Using for each loop========= ");
		for(Object o:h)
		{
			System.out.println(o);
		}
		System.out.println("===========Using iterator======== ");
		Iterator it=h.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		h.clear();
		if(h.isEmpty())
		{
			System.out.println(h);
		System.out.println("it is empty now");
		}
		
		
		
	}

}
