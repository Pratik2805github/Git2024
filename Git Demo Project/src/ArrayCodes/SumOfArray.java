package ArrayCodes;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SumOfArray {
public static void main(String[] args) {
	int sum=0;
	int a[]=new int[4];
	System.out.println("enter avalues");
	Scanner sc=new Scanner(System.in);
	for(int i=0 ;i<a.length;i++){
		a[i]=sc.nextInt();
		
	}
	for(int i=0;i<a.length;i++) {
	sum=sum+a[i];
	
	}
	System.out.println("Sum of array" +sum);
}
}
