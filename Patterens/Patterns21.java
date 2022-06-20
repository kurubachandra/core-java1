package Patterens;

public class Patterns21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b=5;
for(int i=1;i<=b;i++) {
	for(int j=b;j>=1;j--) {
		if(i>=j) 
		{
			System.out.print("* ");

		}
		else 
		{
			System.out.print(" ");
		}
		
	}
	System.out.println();
}
	}

}
