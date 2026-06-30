package Solid_Principles;

public class Driver_cash {

	public static void main(String[] args) {
		payment p = new CardPayment();
		p.pay();
		((CardPayment) p). bill();
	}
}
