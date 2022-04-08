package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector<>();//it is a legacy class
		
		v.add("velocity");
		v.add(1);
		v.add(null);		//multiple null values allowed
		v.add("Pune");
		v.add('B');  		//duplicates are allowed
		v.add('B');
		v.add(null);
		v.add(123.465);	//any type of number is allowed
		v.add(99233879112L);//after 9 digit use L for long
		
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.contains(1));
		System.out.println(v.get(0));
		
		v.add(3, "three");
		v.add(5, 5);
		v.add(4,'a');
		v.remove(null);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.indexOf('B'));
		
		System.out.println("===========================using enumeration=================");
		Enumeration e=v.elements();//it is only apply at legacy class
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("===========================using for loop=================");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("===========================using for each loop=================");
		for(Object o:v)
		{
			System.out.println(o);
		}
		System.out.println("===========================using List Iterator=================");
		ListIterator li=v.listIterator();//ListIterator can read, remove and replace
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("===========================using Iterator=================");
		Iterator i = v.iterator();//Iterator can read and remove
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
