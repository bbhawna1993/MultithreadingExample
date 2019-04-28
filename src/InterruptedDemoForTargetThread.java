class DemoThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<1000;i++)
		{
			System.out.println("inside waiting thread"+i);
		}
		System.out.println("I want to sleep");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("I got interrupted");
		}

	}
}

public class InterruptedDemoForTargetThread {

	public static void main(String[] args) {
		DemoThread d=new DemoThread();
		d.start();

		d.interrupt();

		System.out.println("end of main thread");

	}

}
