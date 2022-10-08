
public class NewThreadRunner {

	public static void main(String[] args) {

		NewThread newThread = new NewThread();
		newThread.start();
		System.out.println(Thread.currentThread().getName());
		
		
		NewThread newThread1 = new NewThread();
		newThread1.start();
		
		
		NewThread newThread4 = new NewThread();
		newThread4.start();
		
		NewThread newThread2 = new NewThread();
		newThread2.start();
		
		NewThread newThread3 = new NewThread();
		newThread3.start();
		
		

	}

}
