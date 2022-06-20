package Areaofcircle;
import java.util.*;
import java.util.Scanner;
interface Area{
	void circle();
}
public abstract class AreaCal implements Area{
	double area;
	public void circle(double r) {
		area=(22*r*r)/7;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
AreaCal x;
Scanner s=new Scanner(System.in);
System.out.println("enter the radius");
double radius=s.nextDouble();
x=new AreaCal();
x.circle(radius);
System.out.println("Area ofcircle is:"+x.area);
	}

}
