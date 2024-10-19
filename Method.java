public class Method {
	public static void main(String args[]) {
		sum();
		sub(20, 10);
	}

	public static void sum() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
	}

	public static void sub(int a, int b) {
		int sub = a - b;
		System.out.println(sub);
	}
}