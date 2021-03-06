/*Interrupt call is made when the thread enters into sleeping or waiting state.*/
class DemoThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10000;i++)
		{
			System.out.println("I am a lazy thread"+i);
		}
		System.out.println("I want to sleep");
		try {
			Thread.sleep(10000);
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

		//main thread interrupted child thread.
		d.interrupt();

		System.out.println("end of main thread");

	}

}


