package corejava;
import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int b=sc.nextInt();
System.out.println("factorial of"+b+"is"+factorial(b));
	}
static int factorial(int b) {

int i,fact=1;
for(i=1;i<=b;i++)
{
	fact=fact*i;
	
}
return fact;
}
}



