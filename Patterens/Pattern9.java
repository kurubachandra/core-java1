package Patterens;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
int x;
for(int i=1;i<=n;++i) {
	x=n-i+1;
	for(int j=1;j<=n;++j) {
		System.out.print(" "+x);
		x=x+n;
	}
System.out.println();
}
	}

}
