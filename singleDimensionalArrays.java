import java.util.Scanner;

public class singleDimensionalArrays {

public static void main(String[] args) {
		int len;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array length : ");
		len=sc.nextInt();
		int a[]=new int[len];  	 
		System.out.print("Enter " + len + " Element to Store in Array :\n");
	        for(int i=0; i<len; i++)
	        {
           a[i] = sc.nextInt();
	        }   
        System.out.print("Elements in Single Dimensional Arrays are :\n");
        for(int i=0; i<len; i++)
        {
           System.out.print(a[i] + "  ");
        }  
	}
}