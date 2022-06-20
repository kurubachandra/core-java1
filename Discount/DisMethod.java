package Discount;

public class DisMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double dis,markedprice,amount,s;
markedprice=Double.parseDouble(args[0]);
dis=Double.parseDouble(args[1]);
System.out.println("markedprice="+markedprice);
System.out.println("discount rate="+dis);
s=100-dis;
amount=calculateDiscount(markedprice,s);
System.out.println("amount after discount="+amount);

	}

	static double calculateDiscount(double markedprice,double s) {
		double amount=(s*markedprice)/100;
		return amount;
	}
}
