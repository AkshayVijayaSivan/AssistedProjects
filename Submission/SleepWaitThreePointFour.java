package com.akshay.training;

public class SleepWaitThreePointFour {

	public static void main(String[] args) {
		new Thread(new TryWait()).start();

	}

}


class TryWait implements Runnable{
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName()+" is going to sleep");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("interrupted execution");
		}
		System.out.println(Thread.currentThread().getName()+" Has woken up \n");
		try {System.out.println("Waiting for 3 secs");
			wait(3000);
		} catch (InterruptedException e) {
			System.out.println("execution interrupted");
		}
		System.out.println("Wait is over");
	}
}