package corejava;


import java.util.Scanner;

public class Floop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long g,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
g=sc.nextLong();
int i=1;
while (i<=g) {
	fact=fact*i;
	i++;
}
System.out.println("factorial="+fact);
	}

}
