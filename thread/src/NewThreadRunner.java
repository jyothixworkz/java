
public class NewThreadRunner {
	
	
	
	public static void main(String[] args) {
		
		NewThread newThread=new NewThread();
		newThread.start();
		NewThread newThread1=new NewThread();
		newThread1.run();
		Thread thread= new Thread(newThread1);
		thread.setName("manoj");
		 thread.start();
	System.out.println(newThread1.currentThread().getName());
		 System.out.println(thread.currentThread().getName());
		
		
			 
		
	}

}
