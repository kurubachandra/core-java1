package Patterens;

public class PatterR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int x=2;
		for(int i=1;i<=n;++i) {
			for(int j=1;j<=n;++j) {
				System.out.printf("%2d ", x);
				x+=2;
			}
			System.out.println();
		}

	}

}
