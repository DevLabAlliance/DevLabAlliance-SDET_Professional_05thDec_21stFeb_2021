package com.devlabs.java.lab1;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			count = 0;
			for (int j = 1; j <= i ; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i+" is a prime number");
			}
		}
	}

}
