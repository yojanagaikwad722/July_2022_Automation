package Constructor;

public class example3 {

	// declaration
	int a;
	int b;
	int c;//0

	example3() {
	    a = 10;// initialization
		b = 20;
	}

	example3(int x, int y) {//20, 20
		a = x;
		b = y;
	}

	example3(int x, int y, int z) {
		a = x;
		b = y;
		c = z;
	}

	public void multiplication() {
		System.out.println(a * b * c);
	}
}
