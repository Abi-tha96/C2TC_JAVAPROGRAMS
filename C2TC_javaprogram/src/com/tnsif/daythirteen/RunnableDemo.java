package com.tnsif.daythirteen;

public class RunnableDemo {
	
	public static void main(String[] args) {
		UsingRunnable obj=new UsingRunnable(5,10,"hello coders..");
		Runnable runnable=new Runnable() {
			
			public void run()
			{
				System.out.println("running task from anonyms");
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
