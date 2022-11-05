package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class _HashSet2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add("Quantum Academy");
		al.add(100);
		al.add(null);
		al.add('A');
		al.add(false);
		al.add("testing");
		al.add(100);
		al.add(null);
		al.add('A');

		System.out.println(al);//[Quantum Academy, 100, null, A, false, testing, 100, null, A]
		
		HashSet hs = new HashSet(al);
		System.out.println(hs);//[null, A, 100, false, testing, Quantum Academy]	
		
	}
}
