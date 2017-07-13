package com.lambdaProj;

public class LambdaAsInterface {
	
	public static void main(String args[]){
		
		Greeting greeting = () -> System.out.println("Good Morning");
		
	}

	
}

interface Greeting{
	void foo();
}