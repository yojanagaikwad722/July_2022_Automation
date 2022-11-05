package ControlStatements;

public class _SWITCH {

	public static void main(String[] args) {
		String option = "CP";

		switch (option) {
		case "BI":
			System.out.println("---Balance Inquiry---");
			break;

		case "MT":
			System.out.println("---Money Transfer---");
			break;

		case "CW":
			System.out.println("---Cash Withdrawl---");
			break;

		case "CP":
			System.out.println("---Change Pin---");
			break;

		default:
			System.out.println("---wrong input---");
			break;

		}
	}
}
