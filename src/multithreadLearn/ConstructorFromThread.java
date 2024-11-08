package multithreadLearn;

class A4 extends Thread {
	public A4(String name) {
		super(name);
	}

	public void run() {
		System.out.println("Thanks " + this.getName());
	}
}

public class ConstructorFromThread {

	public static void main(String[] args) {

		A4 obj1 = new A4("Iron");
		A4 obj2 = new A4("Thor");
		A4 obj3 = new A4("Hulk");

		obj1.start();
//		obj1.setPriority(Thread.MAX_PRIORITY); //to set priority
		obj2.start();
		obj3.start();

		System.out.println("Id of thread "+obj1.getName()+", is " + obj1.threadId()+" and priority is: "+obj1.getPriority());

		System.out.println("Id of thread "+obj2.getName()+", is " + obj2.threadId()+" and priority is: "+obj2.getPriority());

		System.out.println("Id of thread "+obj3.getName()+", is " + obj3.threadId()+" and priority is: "+obj3.getPriority());

	}

}
