package multithreadLearn;

class Counter {
	int count;

	public void increment() {
		count++;
	}
}


class A3 implements Runnable {
	Counter c;

	public A3(Counter c) { //counstructor me as parameter pass kiya
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			c.increment();
			
		}
	}
}



class B3 implements Runnable {
	Counter c; //counter class ka reference object 

	public B3(Counter c) { //counstructor me as parameter pass kiya
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			c.increment();
			
		}
	}
}

/*
 JOIN thread using constructor
 */

public class ThreadJoinTest2 {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();

		A3 a = new A3(c);
		B3 b = new B3(c);



		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);

		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println(c.count);
		System.out.println("He is very good in Multitasking.");
		
		

	}

}
