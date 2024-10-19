public class FansInfo {
	public static void main(String args[]) {
		Fans fan = new Fans("Havells", 5487, 5, "Ceiling Fan", 5000);
		fan.printDetails();

		Fans fan1 = new Fans("Crompton", 4484, 4, "Ceiling Fan", 4000);
		fan1.printDetails();

		Fans fan2 = new Fans("LG", 1333, 5, "Ceiling Fan", 2000);
		fan2.printDetails();

		Fans fan3 = new Fans("RG", 7487, 3, "Ceiling Fan", 2000);
		fan3.printDetails();

		Fans fan4 = new Fans("Loyyed", 5487, 5, "Ceiling Fan", 5000);
		fan4.printDetails();

		Fans fan5 = new Fans();
		fan5.printDetails();
	}
}