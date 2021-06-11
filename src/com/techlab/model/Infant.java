package com.techlab.model;

public class Infant implements IEmotionable{

	@Override
	public void cry() {
		System.out.println("Child is crying");
	}

	@Override
	public void laugh() {
		System.out.println("Child is laughing");
	}

}
