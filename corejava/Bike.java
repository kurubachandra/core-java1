package corejava;

public class Bike {
 static int wheels=2;
 String color="";
 static void braking() {
	 System.out.println("bike halts when brakes appiled");
 }
 void mileage(int s) {
	 System.out.println("mileage is" + s + "kmph");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Bike RoyalEnfield=new Bike();
   Bike R15=new Bike();
   Bike Platina=new Bike();
   RoyalEnfield.braking();
   R15.braking();
   Platina.braking();
   RoyalEnfield.mileage(30);
   R15.mileage(30);
   Platina.mileage(90);
  System.out.println("welcome to ojas");
   System.out.println("no of wheels "+RoyalEnfield.wheels);
   System.out.println("no of wheels "+R15.wheels);
   System.out.println("no of wheels "+Platina.wheels);
   RoyalEnfield.color="black";
   R15.color="blue";
   Platina.color="red";
   System.out.println(""+RoyalEnfield.color);
   System.out.println(""+R15.color);
   System.out.println(""+Platina.color);
   
   

	}

}
