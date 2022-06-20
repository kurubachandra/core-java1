package corejava;

public class Funct {
//local variable
	int a=10;//instace variable
	public static int  b=20;// static variable
	
	void printRam() {
		String a="babloo";
		System.out.println("my name is:"+a);
		// end of function
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Funct obj=new Funct();
      Funct obj2=new Funct();
      obj.printRam();// method calling == memory allocates 
      System.out.println(""+obj.a);//10
      System.out.println(""+Funct.b);//20
      System.out.println(""+obj.a);//10
      System.out.println(""+b);//20
      System.out.println(""+obj2.b);//20
      obj.a=100; obj.b=200;
      System.out.println("************");
      System.out.println(""+obj.a);//100
      System.out.println(""+obj2.a);//10
      obj.b=500;
      System.out.println(""+obj.b);//200
     
      System.out.println(""+obj2.b);//200
	}

}
