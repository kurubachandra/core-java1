package Areaofcircle;

import java.util.Scanner;

public class AreaStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius");
double rad=sc.nextDouble();
double a=area(rad);
System.out.println("Area of circle:"+a);

	}
	static double area(double r) {
		return (22*r*r)/7;
	}

}
