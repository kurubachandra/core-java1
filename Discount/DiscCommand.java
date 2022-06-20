package Discount;

public class DiscCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double dis,markedprice,amount,s;
markedprice=Double.parseDouble(args[0]);
dis=Double.parseDouble(args[1]);
System.out.println("marked price="+markedprice);
System.out.println("discount rate="+dis);
s=100-dis;
amount=(s*markedprice)/100;
System.out.println("amount after discount="+amount);
	}

}
