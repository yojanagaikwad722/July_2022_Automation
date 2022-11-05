package STRING;

public class String_Functions {

	public static void main(String[] args) {
		String s1 = "Quantum  Academy";
		String s2 = "Quantum Academy";
		String s3 = "quantum academy";
		String s4 = " ";
		String s5 = "quantum";
		
		//1. equals -> true/false
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		
		//2. equalsIgnoreCase -> true/false
		System.out.println(s1.equalsIgnoreCase(s3));//true
		
		//3. length -> no. of characters in String(space is also considered as character)
		System.out.println(s1.length());//16
		
		//4. toLowerCase
		System.out.println(s1.toLowerCase());//quantum  academy
		
		//5. toUpperCase
		System.out.println(s3.toUpperCase());//QUANTUM ACADEMY
		
		//6. isEmpty
		System.out.println(s1.isEmpty());//false
		System.out.println(s4.isEmpty());//true
		
		//7. contains
		System.out.println(s3.contains(s5));//true
		
		//8. startsWith
		System.out.println(s2.startsWith("Quan"));//true
		
		//9. endsWith
		System.out.println(s2.endsWith("Y"));//false
		
		//10. charAt
		System.out.println(s3.charAt(2));//a
		
		//11. replace
		System.out.println(s3.replace('q', 'Q'));//Quantum academy
		
		//12. replaceFirst
		System.out.println(s3.replaceFirst("quantum", "quAntum"));//quAntum academy
		
		//13. substring
		System.out.println(s5.substring(2));//antum
		System.out.println(s5.substring(0, 4));//quan //endIndex -> actual endIndex + 1
		
		//14. lastIndexOf
		System.out.println(s3.lastIndexOf('a'));//10
		System.out.println(s3.lastIndexOf("academy"));//8
		
		//15. concat
		System.out.println(s2.concat(s3));//Quantum Academyquantum academy
		
		System.out.println(s4.isBlank());//true
		System.out.println(s4.isEmpty());//false

	}
}
