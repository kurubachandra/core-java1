package Factorial;
import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long j,fact=1;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a number");
		 j=sc.nextLong();
		for(int i=1;i<=j;i++) {
fact=fact*i;
		}
		System.out.println("factorial ="+fact);
	}

}
