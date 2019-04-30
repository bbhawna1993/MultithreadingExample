package com.io.synchronizationdemo;

public class Display {

	public synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{System.out.print("good morning:");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" "+name);
		}
	}
}
