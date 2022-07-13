package task1To10.task7;

public class CommonValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Arrays");
		int size = sc.nextInt();
		System.out.println("Enter the value for the 1st Array");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the value for the 2nd Array");
		int[] arr1 = new int[size];
		for (int k = 0; k < size; k++) {
			arr1[k] = sc.nextInt();
		}
		System.out.print("The common values between to arrays are");
		for (int j = 0; j < size; j++) {
			if (arr[j] == arr1[j]) {
				System.out.println(" " + arr[j]);
			}
		}
	}


}
