package corejava;

public class TypeOfVariables {
	int b = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeOfVariables obj = new TypeOfVariables();
		int a = 10;
		System.out.println("A=" + a);
		System.out.println("B=" + obj.b);
		obj.m1();
	}

	public void m1() {
		System.out.println("B=" + b);
	}
}
