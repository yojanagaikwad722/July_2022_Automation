package Collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class _LinkedHashSet1 {

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
		
		LinkedHashSet lhs = new LinkedHashSet(al);
		System.out.println(lhs);//[Quantum Academy, 100, null, A, false, testing]
	}
}
