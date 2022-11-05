package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class _TreeSet2 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(65);
		ts.add(52);
		ts.add(100);
		ts.add(89);
		ts.add(200);
	//	ts.add(null);//NullPointerException
		
		System.out.println(ts);//[52, 65, 89, 100, 200]
		System.out.println(ts.size());//5
		System.out.println(ts.contains(52));//true
		System.out.println(ts.isEmpty());//false
		
		ts.remove(52);
		System.out.println(ts);//[65, 89, 100, 200]
		
		System.out.println(ts.first());//to get 1st element from treeset - 65
		System.out.println(ts.last());//to get last element from treeset - 200
		
		ts.pollFirst();//deletes first element from treeset
		System.out.println(ts);//[89, 100, 200]
		
		ts.pollLast();//deletes last element from treeset
		System.out.println(ts);//[89, 100]

		System.out.println("---Print all the information from TreeSet by descending order---");
		Iterator ditr = ts.descendingIterator();
		while(ditr.hasNext()) {
			System.out.println(ditr.next());
		}

		System.out.println("---Print all the information from TreeSet using Iterator---");
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all the information from TreeSet using for each loop---");
		for(Object t1:ts) {
			System.out.println(t1);
		}

	}
}
