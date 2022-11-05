package AccessSpecifiers;

public class staticBlock {

	public static void main(String[] args) {
		staticBlock s = new staticBlock();
	}
	static {//static initialization block
		System.out.println("good night");
	}
	
	{//instance initialization block
		System.out.println("good morning");
	}
}
