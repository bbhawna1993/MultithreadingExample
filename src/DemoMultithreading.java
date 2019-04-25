
public class DemoMultithreading extends Thread{

	/*Even though we have overriden the run method,still it will call the no argument 
	 * run method
	 * (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	public void run()
	{
		System.out.println("run method");

	}
	/*
	 * even though we have overriden the start method,a new thread wil not be created.
	 * now when we call super.start(),will call the run() method.
	 * */

	public void start()
	{
		super.start();
		System.out.println(" start method");
	}

	public static void main(String[] args)
	{
		DemoMultithreading d=new DemoMultithreading();
		d.start();
        
		System.out.println("main thread");
		

	}

}