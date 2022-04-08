package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue pq=new PriorityQueue();//can store only homogeneous data(any one data-type only) or will give class cast exception
		
		pq.add('A');
		pq.add('a');
		pq.add('C');
//		pq.add(null);	//null values are not allowed gives null pointer exception
		pq.add('c');
		pq.add('B');
		pq.add('B');	////duplicates are allowed
		
		System.out.println(pq);
		System.out.println(pq.size());
		pq.add('E');
		pq.add('D');
		pq.add('d');
		pq.add('b');
		pq.remove('B');
		System.out.println(pq);
		System.out.println(pq.size());
		System.out.println(pq.element());//to check which element has most priority
		System.out.println("removed element :-"+pq.remove());//it will remove prior element which is first added element
		System.out.println(pq.poll());//it will Retrieves and remove prior element
		System.out.println(pq);
		System.out.println("peek element :-"+pq.peek());//Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println("peek element :-"+pq.peek());
		
		pq.add('E');
		pq.add('D');
		pq.add('d');
		pq.add('b');
		pq.add('A');
		pq.add('a');
		pq.add('C');
		
		System.out.println("===========Using for each loop========= ");
		for(Object o:pq)
		{
			System.out.println(o);
		}
		
		System.out.println("===========Using iterator======== ");
		Iterator it=pq.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
