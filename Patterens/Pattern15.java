package Patterens;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=1;i<=n;i++) {
	for(int j=0;j<=n;++j) {
		System.out.printf(((i+j)%2)+" ");
	}
	System.out.println();
}
	}

}
