package task11To22.task16;

public class OneThreadExample {
	public static void main(String[] args) {

		Thread2 t1 = new Thread2();
		t1.start();
	}
}

class Thread2 extends Thread {
	int Sum1 = 0;

	public void run() {

		for (int i = 0; i <= 100; i++) {

			Sum1 = Sum1 + i;
		}
		System.out.println("sum of 1 to 100 numbers  " + Sum1);
	}

}
