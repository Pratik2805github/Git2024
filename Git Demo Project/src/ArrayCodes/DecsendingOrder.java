package ArrayCodes;

public class DecsendingOrder {
public static void main(String[] args) {
	int temp=0;
    int a[]= {9,6,5,3,2,19};
    for(int i=0;i<a.length;i++) {
    	for(int j=i+1;j<a.length;j++) {
    		if(a[i]<a[j]) {
    		temp=a[i];
    		a[i]=a[j];
    		a[j]=temp;
    		}
    		
    	}
    }
    for(int i=0;i<a.length;i++)
    System.out.println(a[i] +"  ");
}
}
