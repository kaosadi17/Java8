package com.lambdaProj;

public class InterfaceClz implements A,B{
	@Override
	public void show() {
		A.super.show();
	}

}

interface A{
	default void show(){
		System.out.println("From Interface A");
	}
}

interface B{
	default void show(){
		System.out.println("From Interface B");
	}
}
