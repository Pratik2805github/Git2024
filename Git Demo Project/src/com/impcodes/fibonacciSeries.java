package com.impcodes;
//0,1,2,3,5,8,1.......n
import java.util.Scanner;

public class fibonacciSeries {
public static void main(String[] args) {
	int a=0,b=1,c;

	System.out.println("enter a number");
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<=n;i++) {
		System.out.println(a);
		c=a+b;
		a=b;
		b=c;
		
		
	}
}
}
