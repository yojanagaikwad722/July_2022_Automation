package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class _LinkedHashSet2 {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Quantum Academy");
		lhs.add(100);
		lhs.add(true);
		lhs.add(null);
		lhs.add(100);
		
		System.out.println(lhs);//[Quantum Academy, 100, true, null]
		System.out.println(lhs.size());//4
		
		//lhs.clear();
		//System.out.println(lhs.isEmpty());//true
		
		System.out.println(lhs.contains(200));//false
		
		lhs.remove(null);
		System.out.println(lhs);//[Quantum Academy, 100, true]

		System.out.println("---Print all the information in LinkedHashSet using Iterator---");
		Iterator itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("---Print all the information in LinkedHashSet using for each loop---");
		for(Object l1:lhs) {
			System.out.println(l1);
		}

	}
}
