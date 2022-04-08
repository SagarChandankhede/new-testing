package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet t=new TreeSet();//can store only homogeneous data(any one data-type only) or will give class cast exception
		t.add(101);
		t.add(102);
		t.add(103);
	//	t.add(null);		//null values are not allowed gives null pointer exception
		t.add(104);
		t.add(104); 		//does not allows duplicates value
		t.add(107);
		t.add(106);
	//	t.add(123.321);	//any type of number is allowed
	//	t.add(99233879112L);//after 9 digit use L for long
		
		System.out.println(t);//order insertion is Asscending  & no default capacity
		System.out.println(t.size());//Datasize is : Balanced tree
		t.remove(106);
		System.out.println(t);
		System.out.println(t.isEmpty());////storage type: hashtable 
		System.out.println(t.contains(106));
		t.add(105);//can not add by index
		System.out.println(t);
		
		System.out.println(t.pollFirst());// removes minimum(first in array) value
		System.out.println(t.pollLast());//removes maximum(last in array) value
		
		System.out.println("===========Using iterator======== ");
		Iterator it=t.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===========Using for each loop========= ");
		for(Object o:t)
		{
			System.out.println(o);
		}
	}

}
