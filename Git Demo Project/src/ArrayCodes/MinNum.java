package ArrayCodes;

import java.util.Scanner;

public class MinNum {
public static void main(String[] args) {
	int a[]=new int[4];
	System.out.println("enter a values");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	int Min=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]<Min) {
			Min=a[i];
		}
	}
	System.out.println("max value is" + Min);
}
}
