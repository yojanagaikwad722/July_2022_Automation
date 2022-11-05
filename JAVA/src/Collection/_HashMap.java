package Collection;

import java.util.HashMap;

public class _HashMap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "Quantum Academy");
		map.put("2", "Software Testing");
		map.put("3", "Automation Testing");
		map.put("4", "Manual Testing");

		System.out.println(map);//{1=Quantum Academy, 2=Software Testing, 3=Automation Testing, 4=Manual Testing}
		
		System.out.println(map.get("2"));// Software Testing
		
		map.remove("2");
		System.out.println(map);//{1=Quantum Academy, 3=Automation Testing, 4=Manual Testing}
		
		//map.clear();
		//System.out.println(map);//{}
		
		System.out.println(map.size());//3
		
		System.out.println(map.keySet());//[1, 3, 4]
		
		System.out.println(map.values());//[Quantum Academy, Automation Testing, Manual Testing]

	}
}
