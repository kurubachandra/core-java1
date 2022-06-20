package corejava;
import java.util.Scanner;
public class Doloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long f,fact=1;
Scanner ob=new Scanner(System.in);
System.out.println("enter a number");
f=ob.nextLong();
int i=1;
do {
	fact=fact*i;
	i++;
	
}
while(i<=f);
System.out.println("factorial="+fact);
	}
	
}
