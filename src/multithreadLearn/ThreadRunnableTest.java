package multithreadLearn;

class A1 implements Runnable {

	public void run() {
		int i = 1;
		while (i < 10) {
			System.out.println("A class thread running");
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

class B1 implements Runnable {

	public void run() {
		int i = 1;
		while (i < 15) {
			System.out.println("B class thread running");
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class ThreadRunnableTest {
	public static void main(String[] args) {
		A1 a = new A1();
		Thread t1 = new Thread(a);
		B1 b = new B1();
		Thread t2 = new Thread(b);
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t2.start();
	

	}

}
