package task;

import java.util.Scanner;

public class AgeOfAPerson {
double birthyear,birthmonth;
static double ageOfAPerson(double birthyear,double birthmonth) {
double age=2022-birthyear;
double age1=(age*12+birthmonth)/12;
if(birthyear<1||birthmonth<0) {
	return-1;
	
}
//else if(birthyear>2022||birthmonth>6) {
//	return-2;
//}
else {
	return age1;
}
}
public static void main(String args[]) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter your birth month");
double birthMonth=sc.nextDouble();
System.out.println("enter your birth year");
double birthYear=sc.nextDouble();
System.out.println(ageOfAPerson(birthYear,birthMonth));
	}
}

