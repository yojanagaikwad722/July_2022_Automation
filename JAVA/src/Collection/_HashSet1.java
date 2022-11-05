package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class _HashSet1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add("Quantum Academy");
		hs.add(true);
		hs.add(100);
		hs.add(45.56f);
		hs.add(null);
		hs.add(null);
		hs.add('A');
		hs.add(100);

		System.out.println(hs);// [null, A, 100, 45.56, Quantum Academy, true]
		System.out.println(hs.size());// 6

		System.out.println(hs.isEmpty());// false
		System.out.println(hs.contains(100));// true

		hs.remove(100);
		System.out.println(hs);// [null, A, 45.56, Quantum Academy, true]

		// hs.clear();
		// System.out.println(hs);// []
		// System.out.println(hs.size());// 0

		System.out.println("---Print all the information in HashSet using Iterator---");
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("---Print all the information in HashSet using for each loop---");
		for (Object h1 : hs) {
			System.out.println(h1);
		}

	}
}
