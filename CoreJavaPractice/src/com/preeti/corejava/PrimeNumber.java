package com.preeti.corejava;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in) ;
		int p=Integer.MAX_VALUE;
		System.out.println(p);
		while(p!=0) {
			p=scn.nextInt();
			System.out.println("You entered number: "+p +" is" +"  "+ isPrime(p));
		}
		
	}

	public static boolean isPrime(int p) {
		int sqrt =(int) Math.sqrt(p) +1;
		for(int i=2;i<sqrt;i++) {
			if(p%i==0) {
				return false;
			}
		}return true;
	}

}
