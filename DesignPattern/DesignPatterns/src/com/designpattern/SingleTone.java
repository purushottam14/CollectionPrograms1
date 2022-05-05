package com.designpattern;

public class SingleTone {
	public static void main(String [] args) {
		
	}

	private static SingleTone st= new SingleTone();
	
	public static SingleTone getSingleTone() {
		return st;
		
	}
	public void message() {
		System.out.println("Single tone created");
	}
}
