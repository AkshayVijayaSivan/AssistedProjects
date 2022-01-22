package com.akshay.training;

public class ThreadThreepoitThree extends Thread{

	public static void main(String[] args) {
		
		RunnableInterface task = new RunnableInterface();
		Thread td2= new Thread(task);
		
		
		ThreadThreepoitThree td1 = new ThreadThreepoitThree();
		
		td1.setName("Thread Extend");
		td2.setName("Runnable inter");
		
		td1.start();
		td2.start();
		

	}
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+" is running with extended thread");
		
	}
	

}

class RunnableInterface implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running with Runnable interface");
	}
}
