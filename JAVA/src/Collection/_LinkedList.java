package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class _LinkedList {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("Quantum Academy");
		ll.add(100);
		ll.add('A');
		ll.add(null);
		ll.add(null);

		System.out.println(ll);// [Quantum Academy, 100, A, null, null]
		System.out.println(ll.size());// 5
		System.out.println(ll.isEmpty());// false
		System.out.println(ll.get(4));// null
		System.out.println(ll.contains('A'));// true

		// remove/delete info from LinkedList
		ll.remove(4);
		System.out.println(ll);// [Quantum Academy, 100, A, null]

		// modify/replace/update info from LinkedList
		ll.set(3, 200);
		System.out.println(ll);// [Quantum Academy, 100, A, 200]

		System.out.println("---Print all the information in LinkedList using for each---");
		for (Object l1 : ll) {
			System.out.println(l1);
		}

		System.out.println("---Print all the information in LinkedList using for loop---");
		for (int i = 0; i <= ll.size() - 1; i++) {
			System.out.println(ll.get(i));
		}

		System.out.println("---Print all the information in LinkedList using Iterator---");
		Iterator itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("---Print all the information in LinkedList using ListIterator---");
		ListIterator litr = ll.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

	}
}
