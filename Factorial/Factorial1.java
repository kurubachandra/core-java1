package Factorial;
import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Long j;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
j=sc.nextLong();
long f=Factorial1.fact(j);
System.out.println("factorial =" +f);
	}

	static long fact(long j) {
		if(j<=0) 
			return 1;
		return Factorial1.fact(j-1)*j;
			
		
		
	}
}
