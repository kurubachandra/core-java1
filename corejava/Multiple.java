package corejava;

public class Multiple {
	static String multiple(int a) {

		return 13 + "*" + a + "=" + 13 * a;
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++)
			// TODO Auto-generated method stub
			System.out.println(multiple(i));

	}

}
