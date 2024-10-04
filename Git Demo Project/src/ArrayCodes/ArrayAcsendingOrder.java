package ArrayCodes;

public class ArrayAcsendingOrder {
public static void main(String[] args) {
	int temp;
	int a[]= {9,8,7,6,11,3,4,5};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i] +"  ");
	}
}
}
