package com.io.childthreadwaitmainthread;

/*
 * This program demos deadlock situation for main thread.
 * through Thread.currentThread().join() method,main thread is waiting for itself to be 
 * completed. 
 */
public class MainthreadDeadlock {

	public static void main(String[] args) throws InterruptedException {

		Thread.currentThread().join();
	}

}
