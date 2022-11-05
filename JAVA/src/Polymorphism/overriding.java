package Polymorphism;

public class overriding {

	public static void main(String[] args) {
		GoodMorning gm = new GoodMorning();
		gm.wish();//good morning
		
		GoodNight gn = new GoodNight();
		gn.wish();//good night
	}
}
