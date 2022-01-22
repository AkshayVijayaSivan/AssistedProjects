package com.akshay.training;

public class SyncThreePointSix {

	public static void main(String[] args) {
		
		SyncDemo sync = new SyncDemo();
		
		Thread one=new Thread(sync);
		Thread two = new Thread(sync);
		Thread three = new Thread(sync);
		
		
		one.start();
		two.start();
		three.start();
		
		

	}

}


class SyncDemo implements Runnable{
	public void run(){
		synchronized (this) {
			
			for(int i = 1; i<=3;i++) {
				System.out.println(Thread.currentThread().getName() + " IS EXECUTINg. number "+i);
			}
			System.out.println();
		}
	}
}