package corejava;
import java.util.Scanner;
public class Minmax {
	int m;
	int n;
static	void min(int a,int b)// parameters , formal parameters
{
		if(a>b) {
			System.out.println(+a+"  is max");
		}
		else {
			System.out.println(+b+"  is max");
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
System.out.println("enter 1st no.");
int d=sc.nextInt();
System.out.println("enter 2nd no.");
int e=sc.nextInt();
min(d,e);// arguments or acutal parameters
	}

}
