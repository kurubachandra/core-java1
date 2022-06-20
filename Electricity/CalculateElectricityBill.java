package Electricity;
import java.util.Scanner;
class ComputeElectricityBill{
	double billpay;

ComputeElectricityBill(long units) {
	if(units<100)
		billpay=units*1.20;
	else if(units<300)
		billpay=100*1.20+(units-100)*2;
	else if(units>300)
		billpay=100*1.20+200*2+(units-300)*3;
}
}
public class CalculateElectricityBill {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
long units;
Scanner sc=new Scanner(System.in);
System.out.println("enter number of units");
units=sc.nextLong();
ComputeElectricityBill c=new ComputeElectricityBill(units);
System.out.println("bill to pay :"+c.billpay);
	}

}
