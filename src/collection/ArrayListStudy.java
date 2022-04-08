package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> al=new ArrayList<>();//even if we don't write data-type as "<Object>" then also it will run
		al.add("velocity");
		al.add(1);
		al.add('b');
		al.add(null);		//multiple null values allowed
		al.add("Pune");
		al.add('B');  		//duplicates are allowed
		al.add('B');
		al.add(null);
		al.add(123.321);	//any type of number is allowed
		al.add(99233879112L);//after 9 digit use L for long
		
		System.out.println(al); //its default capacity is 10 
		System.out.println(al.size());
		al.add(0, "algorithm");//we are declaring on which index(position) we want to put element, here it is 0th
		al.add(5, 1);//here it 5th
		al.add(9,'a');//here it is 9th it will always takes updated position thats why ArrayList is worse in manipulation
		System.out.println(al);//after that for 11th element capacity will increase by (current capacity*1.5+1)
		System.out.println(al.size());
		al.remove(8);
		al.remove("algorithm");
		al.remove(null);
		al.remove(null);
		
		//al.remove('a');//character isn't supporting remove action by object
		
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(al.contains('b'));//it gives boolean value returns
		System.out.println(al.contains(3));//it check whether given value is present there or not
		System.out.println(al.isEmpty());//true or false
		System.out.println(al.lastIndexOf('B'));
		System.out.println();
		System.out.println(al.get(4));//it is use to fetch the value at given position(index)
		System.out.println("===========Using for loop========= ");
		for (int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("===========Using Iterator========= ");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===========Using for each loop========= ");
		for(Object o:al)
		{
			System.out.println(o);
		}
		
		ArrayList<Integer> Al=new ArrayList<>();
		Al.add(1);
		Al.add(null);//integer data-type Allows Null value
		Al.add(4);
		Al.add(2);
		Al.add(9);
		Al.add(6);
		
		System.out.println(Al);
		System.out.println("===========Using Iterator========= ");
		//Iterator It=Al.iterator();//any of the would work
		Iterator<Integer> It=Al.iterator();
		while (It.hasNext())
		{
			System.out.println(It.next());
		}
		System.out.println("===========Using for each loop========= ");
		for(Object o:Al)
		{
			System.out.println(o);
		}
		
	}

}
