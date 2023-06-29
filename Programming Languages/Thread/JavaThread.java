package Thread;

public class JavaThread extends Thread {
	
	public int sleepTime, number;
	
	public JavaThread(int sleepTime, int number, String name, int priority) {
		this.sleepTime = sleepTime;
		this.number = number;
		this.setName(name);
		this.setPriority(priority);
	}
	
	public void run() {
		for(int i = 1; i <= number; i++) {
			try {
				Thread.sleep(sleepTime);
				System.out.println("-------------" + this.getName() + "-------------");
				System.out.println(this.getId());
				System.out.println(this.getPriority());
				System.out.println(this.isAlive());
				System.out.println(this.toString());
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
