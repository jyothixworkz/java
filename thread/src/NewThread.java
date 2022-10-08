
public class NewThread  extends Thread{
	String man;
		@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("manoj thread");
	}

}
