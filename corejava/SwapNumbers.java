package corejava;
import java.util.Scanner;
public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c = 0;
Scanner sc=new Scanner(System.in);
System.out.println("enter value in a:");
a=sc.nextInt();
System.out.println("enter value in b:");
b=sc.nextInt();

c=a;
a=b;
b=c;

System.out.println("swapped values are :" +a+" "+b);
	}

}
