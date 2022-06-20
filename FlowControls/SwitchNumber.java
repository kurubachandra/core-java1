package FlowControls;
import java.util.Scanner;

public class SwitchNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("-------------------");
System.out.println("1.addition");
System.out.println("2.subtarction");
System.out.println("3.multiplication");
System.out.println("4.division");
System.out.println("-----------------");
System.out.println("enter your choice?");
int choice =sc.nextInt();
System.out.println("enter a value");
int a=sc.nextInt();
System.out.println("enter b value");
int b=sc.nextInt();
switch(choice) {
case 1:
	System.out.println("result="+(a+b));
	break;
case 2:
System.out.println("result="+(a-b));
break;
case 3:
	System.out.println("result="+(a*b));
	break;
case 4:
	System.out.println("result="+(a/b));
	break;
default:
System.out.println("please select your choice range 1-4 only");
}
	}
}
	


