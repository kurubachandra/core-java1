package Areaofcircle;
import java.util.Scanner;
class AreaOfCircle{
	float area;
	void circle(float r) {
		area=(22*r*r)/7;
	}
}

public class AreaCalculation extends AreaOfCircle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius:");
		float rad=sc.nextFloat();
		AreaCalculation a=new AreaCalculation();
		a.circle(rad);
		System.out.println("area of circle is:"+a.area);

	}

}
