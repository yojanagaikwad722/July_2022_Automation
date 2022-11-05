package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class _Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Quantum Academy");
		v.add('B');
		v.add(100);
		v.add(false);
		v.add(45.56f);
		v.add('B');
		v.add(null);

		System.out.println(v);
		System.out.println(v.capacity());// 10
		System.out.println(v.size());// 7
		System.out.println(v.get(2));// 100
		System.out.println(v.isEmpty());// false
		System.out.println(v.contains(200));// false

		// modify/replace/update
		v.set(3, "Pune");
		System.out.println(v);// [Quantum Academy, B, 100, Pune, 45.56, B, null]

		// insert info in between vector -> right shift operation
		v.add(3, 50);
		System.out.println(v.get(3));// 50
		System.out.println(v.get(4));// Pune

		// remove/delete info from vector -> left shift operation
		v.remove(3);
		System.out.println(v.get(3));// Pune

		System.out.println("---Print all the information in Vector using for loop---");
		for (int i = 0; i <= v.size() - 1; i++) {
			System.out.println(v.get(i));
		}

		System.out.println("---Print all the information in Vector using Itertaor---");
		Iterator itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("---Print all the information in Vector using ListIterataor---");
		ListIterator litr = v.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("---Print all the information in Vector using Enumeration---");
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

		System.out.println("---Print all the information in Vector using for each---");
		for (Object v1 : v) {
			System.out.println(v1);
		}

	}
}
