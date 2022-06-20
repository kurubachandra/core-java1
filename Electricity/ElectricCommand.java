package Electricity;
import java.util.*;
public class ElectricCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long units;
units=Long.parseLong(args[0]);
double billpay=0;
if(units>100) {
	billpay=units*1.20;
	
}
else if(units<300) {
	billpay=100*1.20+(units-100)*2;
}
else if(units>300) {
	billpay=100*1.20+200*2+(units-300)*3;
}
System.out.println("bill to pay:"+billpay);
	}

}
