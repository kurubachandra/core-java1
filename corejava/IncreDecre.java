package corejava;

public class IncreDecre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("--pre increment--");
int p=10;
System.out.println("p="+p);
int q=++p;
System.out.println("q="+q);
System.out.println("p="+p);
// post increment
int a=20;
System.out.println("a="+a);
int b=a++;
System.out.println("b="+b);
System.out.println("a="+a);
//pre decremnt
int d=30;
System.out.println("d="+d);
int f=--d;
System.out.println("f="+f);
System.out.println("d="+d);
int j=30;
System.out.println("j="+j);
int i=j--;
System.out.println("i="+i);
System.out.println("j="+j);

	}

}
