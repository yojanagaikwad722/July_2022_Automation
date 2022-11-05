package This_Super_Keyword;

public class Super_Keyword extends example1{

	//int x = 50; - example1 (inheritance)
	int x = 60;//global variable
	
	public void test() {
		int x = 70;//local variable
		System.out.println(x);//70
		System.out.println(this.x);//60
		System.out.println(super.x);//50
		System.out.println(a);//40
	}
	
	public static void main(String[] args) {
		Super_Keyword s = new Super_Keyword();
		s.test();
	}
}
