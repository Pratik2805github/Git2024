package com.impcodes;

import java.util.Scanner;

//divisible by 1 and it self
public class PrimeNumber {
public static void main(String[] args) {
	int count=0;
	System.out.println("enter a number");
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
for(int i=1; i<=n;i++) {
	if(n%i==0) {
		count++;
	}
	
}
if (count==2) {
	System.out.println("it prime");
} else {
	System.out.println("it not  prime");
}
}
}
