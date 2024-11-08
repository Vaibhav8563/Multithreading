package multithreadLearn;

class Student implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Student is studying.");
		}

	}

}

class Employee implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Employee is working.");
		}

	}

}

/*
 * JOIN thread normally
 */
public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {

		Student std = new Student();
		Employee emp = new Employee();

		Thread t1 = new Thread(std);
		Thread t2 = new Thread(emp);

		t1.start();
		t2.start();
		

//join's work is to perform all thread task first then print given message in end 
		t1.join();
		Thread.sleep(1000);
		t2.join();

		System.out.println("Cafe is very good");
	}

}
