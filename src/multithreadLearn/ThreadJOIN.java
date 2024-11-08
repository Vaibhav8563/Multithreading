package multithreadLearn;

class Counter2 {
	int count;

	public void increment() {
		count++;
	}
}

//class A2 implements Runnable {
//
//	public void run() {
//		for (int i = 0; i < 100; i++) {
//
//		}
//	}
//}
//
//class B2 implements Runnable {
//
//	public void run() {
//		for (int i = 0; i < 100; i++) {
//
//		}
//	}
//}


/* 
 Join THREAD through runnable and Lamda
 */
public class ThreadJOIN {

	public static void main(String[] args) throws InterruptedException {
		Counter2 c = new Counter2();
		
//		A2 a = new A2();
//		Thread t1 = new Thread(a);
//		B2 b = new B2();
//		Thread t2 = new Thread(b);
		
		Runnable obj1 = () ->{
			for (int i = 0; i < 100; i++) {
				c.increment();
						}
		};
		
		Runnable obj2 = () ->{
			for (int i = 0; i < 100; i++) {
				c.increment();
						}
		};

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println(c.count);
	}

}
