package task11To22.task17;


public class TwoThreadExample extends Thread{
	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		ThreadEx t1 = new ThreadEx(1, 5);
		ThreadEx t2 = new ThreadEx(5, 10);
		t1.run();
		t2.run();
	//	System.out.println(currentThread().getName());

		synchronized (t1) {
			t1.wait();
		}
		synchronized (t2) {
			t2.wait();
		}
		synchronized (t1) {
			t1.notify();
		}
		synchronized (t2) {
			t2.notify();
		}
	}
}

class ThreadEx implements Runnable {

	private int start=0;
	private int stop=0;
	private int sum;

	ThreadEx(int start, int stop) {
		this.start = start;
		this.stop = stop;
		this.sum = 0;

	}
	
	public void run() {
		for (int i = start; i <= stop; i++) {
			sum = sum + i;
			System.out.println(sum);
			
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread has been interrupted");
			}
			
		}


	}


}
