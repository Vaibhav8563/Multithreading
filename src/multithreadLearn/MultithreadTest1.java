package multithreadLearn;

class A extends Thread {
	public void run() {
		System.out.println("Multiplicaition of 3: ");
		for (int i = 1; i <= 20; i++) {
			System.out.println(3 * i);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

class B extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Class B");

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

class C extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Class C running ");

			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

public class MultithreadTest1 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		a.start();
		a.setPriority(10);

		b.start();

		c.start();

	}

}
