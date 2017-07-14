package com.lambdaProj;

public class RunnableThread {

	public static void main(String[] args) {
		
		//Normal method
		Thread thread1 = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Printed inside runnable");
				
			}
			
		});
		
		thread1.run();
		
		// Using Lambda expression
		Thread thread2 = new Thread(()-> System.out.println("Printed inside lambda"));
		thread2.run();
	}

}
