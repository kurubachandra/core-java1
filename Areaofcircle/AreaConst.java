package Areaofcircle;
import java.util.Scanner;
class Area1{
	double area;
	Area1(double r){
		//this.area=r;
     area=(22*r*r)/7;
		
	}
}
public class AreaConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius:");
double rad=sc.nextDouble();
Area1 a=new Area1(rad);
System.out.println("Area of circle is:"+a.area);
	}

}
