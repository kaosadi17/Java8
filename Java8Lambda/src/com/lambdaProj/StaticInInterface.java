package com.lambdaProj;

public class StaticInInterface {

	public static void main(String[] args) {
		I.show();

	}
	
	public interface I{
		
		static void show(){
			System.out.println("Static method is caled");
		}
	}

}
