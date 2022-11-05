package Collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class _TreeSet1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(200);
		al.add(100);
		al.add(300);
		al.add(900);
		al.add(275);
		al.add(800);
		al.add(300);
		al.add(900);
		al.add(200);
		
		System.out.println(al);//[200, 100, 300, 900, 275, 800, 300, 900, 200]
		
		TreeSet ts = new TreeSet(al);
		System.out.println(ts);//[100, 200, 275, 300, 800, 900]
			
	}
}
