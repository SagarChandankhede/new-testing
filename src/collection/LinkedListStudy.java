package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList<>();
		l.add("velocity");
		l.add(1);
		l.add('b');
		l.add(null);		//multiple null values allowed
		l.add("Pune");
		l.add('B');  		//duplicates are allowed		
		l.add(null);
		l.add('B');
		l.add(123.321);	//any type of number is allowed
		l.add(99233879112L);//after 9 digit use L for long
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.indexOf('B'));
		System.out.println(l.lastIndexOf('B'));
		System.out.println(l.get(4));
		//l.remove('B');
		System.out.println(l);
		l.add(1, l);
		l.set(1, "xyz");//update
		System.out.println(l);
		System.out.println("-----print info in linkdlist using iterator cursor------");
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("-----print info in linkdlist using Listiterator cursor------");
		ListIterator li=l.listIterator();//listIterator is a cursor which travels both the direction  
		//while(li.hasPrevious())
			while(li.hasNext())
		{
			System.out.println(li.next());
			//System.out.println(li.previous());
		}
	
		System.out.println("-----print info in linkdlist using for loop------");
		for(int i=0;i<=l.size()-1;i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println("-----print info in linkdlist using foreach loop------");	
		for(Object o:l)
		{
			System.out.println(o);
		}
	}

}
