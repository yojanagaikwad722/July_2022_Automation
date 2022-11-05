package This_Super_Keyword;

public class This_Keyword {

	int a = 10;//global variable
	
	public void test() {
		int a = 20;//local variable
		System.out.println(a);//20
		System.out.println(this.a);//10
	}
	
	public static void main(String[] args) {
		This_Keyword t = new This_Keyword();
		t.test();
	}
	
	
}
