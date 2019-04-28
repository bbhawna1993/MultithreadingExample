public class DemoYieldMethod implements Runnable{

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("inside child thread");
			Thread.yield();
		}
	}

	public static void main(String[] args)
	{
		DemoYieldMethod m= new DemoYieldMethod();
		Thread t=new Thread(m);
		t.start();

		for(int i=0;i<10;i++)
		{
			System.out.println("inside main thread");
		}
	}
}
