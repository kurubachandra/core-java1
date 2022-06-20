package lcmandhcf;
import java.util.Scanner;
public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		int n1=sc.nextInt();
		System.out.println("enter second value");
		int n2=sc.nextInt();
		int result=hcfCal(n1,n2);
		System.out.println("HCF of "+n1+" and "+n2+" is :"+result);



		}
		static int hcfCal(int a,int b) {
		int temp;
		if(b>0) {
		temp=b;
		b=a%b;
		a=temp;
		}
		return b;
		}



		
	}


