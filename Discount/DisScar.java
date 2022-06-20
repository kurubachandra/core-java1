package Discount;
import java.util.Scanner;
public class DisScar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dis, markedprice,amount,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marked price");
		markedprice=sc.nextDouble();
		System.out.println("enter discount percentage");
		dis=sc.nextDouble();
		s=100-dis;
		amount=(s*markedprice)/100;
		System.out.println("amonut after discount="+amount);

	}

}
