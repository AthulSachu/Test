public class Fan {
	String brandName = "Havells";
	int brandId = 5487;
	int powerRating = 5;
	String type = "Ceiling Fan";
	float price = 5000.0f;		

	public static void canRotate() {

	}

	public static void consumeEnergy() {
		
	}

	public static void noOfRotation() {
		
	}

	public static void printDetails() {
		System.out.println("Brand Name :" +brandName);
		System.out.println("Brand ID :" +brandId);
		System.out.println("Brand power rating :" +powerRating);
		System.out.println("Brand Type :" +type);
		System.out.println("Price :" +price);
	}

	public static void main(String args[]) {
		Fans fan = new Fans();
		Fans fan1 = new Fans();
		Fans fan2 = new Fans();
		Fans fan3 = new Fans();
		Fans fan4 = new Fans();
	}
}

