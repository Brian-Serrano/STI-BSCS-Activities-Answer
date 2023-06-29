package Thread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		new JavaThread(1000, 5, "Thread 1", Thread.MIN_PRIORITY).start();
		Thread.currentThread().join(5500);
		new JavaThread(500, 10, "Thread 2", Thread.NORM_PRIORITY).start();
		Thread.currentThread().join(5500);
		new JavaThread(1500, 3, "Thread 3", Thread.MAX_PRIORITY).start();
	}

}
