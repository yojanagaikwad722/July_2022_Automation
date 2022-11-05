package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _ArrayList {//user defined class

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("Quantum Academy");
		al.add(100);
		al.add(null);
		al.add('A');
		al.add(false);
		al.add("testing");
		al.add(100);
		
		System.out.println(al);//[Quantum Academy, 100, null, A, false, testing, 100]
		System.out.println(al.get(1));//100
		
		System.out.println(al.size());//7
		
		System.out.println(al.isEmpty());//false
		
		System.out.println(al.contains(100));//true
		
		//modify/replace -> set
		al.set(2, 200);
		System.out.println(al);//[Quantum Academy, 100, 200, A, false, testing, 100]
		
		//insert info in between array list -> right shift operation
		al.add(2, 80.25f);
		System.out.println(al.get(2));//80.25
		System.out.println(al.get(3));//200
		
		//delete info from array list -> remove
		al.remove(2);
		System.out.println(al.get(2));//200
		
		System.out.println("---Print all the information in Array List using for loop---");
		for(int i=0; i<=al.size()-1; i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("---Print all the information in Array List using for Iterator cursor---");
		Iterator itr = al.iterator();//[Quantum Academy, 100, 200, A, false, testing, 100]
		while(itr.hasNext()) {//true
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all the information in Array List using for ListIterator cursor---");
		ListIterator litr = al.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("---Print all the information in Array List using for for each loop---");
		for(Object s1:al) {//[Quantum Academy, 100, 200, A, false, testing, 100]
			System.out.println(s1);
		}
	}
}
