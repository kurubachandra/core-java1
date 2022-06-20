package FlowControls;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {10,20,30,40,50};
System.out.println("----normal for loop-------");
for(int i=0;i<arr.length;++i) {
	System.out.println(arr[i]);
}
System.out.println("---for each loop-----");
for(int k:arr) {
System.out.println(k);
}
	}

}
