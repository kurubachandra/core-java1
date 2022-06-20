package FlowControls;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a frist, second and third number");
int fristnumber=sc.nextInt();
int secondnumber=sc.nextInt();
int thirdnumber=sc.nextInt();
if(fristnumber>secondnumber&&fristnumber>thirdnumber) {
	System.out.println("frist number is largest");
	
}
else if(secondnumber>fristnumber&&secondnumber>thirdnumber) {
	System.out.println("second number is largest");
}
else if(thirdnumber>fristnumber&&thirdnumber>fristnumber) {
	System.out.println("third number is largest");
}
	}

}
