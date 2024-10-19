public class Array {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

		System.out.println("Left to Right");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}

		System.out.println("\nRight to Left");
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(" "+arr[i]);
		}

		System.out.println("\nMiddle to left");
		for(int i = (arr.length-1) / 2; i >= 0; i--) {
			System.out.print(" "+arr[i]);
		}

		System.out.println("\nSkipping 1 Element");
		for(int i = 0; i < arr.length; i+=2) {
			System.out.print(" "+arr[i]);
		}
	}
}