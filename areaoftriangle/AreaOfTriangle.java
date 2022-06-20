package areaoftriangle;
import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the side of a triangle");
double a=sc.nextDouble();
double area=(Math.sqrt(3)/4)*(a*a);
System.out.println("Area of triangle:"+area);
	}

}
