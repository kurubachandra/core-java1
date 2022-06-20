package temperature;

import java.util.Scanner;

public class FahrenheitAndCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter fahrenheat temperature");
double fah=sc.nextDouble();
System.out.println("the celsius temperature:"+celcius(fah));
sc.close();
	}
static double celcius(double f) {
	return(f-32)*5/9;
}
}
