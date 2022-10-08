package com.xworkz.thread.runner;

import com.xworkz.thread.PartyType;

public class ThreadRunner {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		PartyType partyType=new PartyType();
		partyType.start();
		System.out.println(partyType.currentThread().getName());
		Thread.sleep(2000);
		PartyType partyType2=new PartyType();
		partyType2.start();
		System.out.println(partyType2.currentThread().getName());
		partyType2.setName("manoj");
		System.out.println(partyType2);
		
		PartyType partyType3=new PartyType();
		new Thread(partyType3).start();
		System.out.println(partyType3.currentThread().getName());
		PartyType pType=new PartyType();
		System.out.println(pType.currentThread().getName());
		new Thread(pType).start();
		Thread t=new Thread(partyType);
		Thread t2=new Thread(partyType3);
		System.out.println(t.currentThread().getName());
		System.out.println(t2.currentThread().getName());
		
		
	}
	
	
	
	
	

}
