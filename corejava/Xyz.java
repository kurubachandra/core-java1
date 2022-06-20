package corejava;

public class Xyz {
public void Sayhello(String name) {
	System.out.println("welcome to ojas mr."+name);
}
public int add(int i,int j) {
	return i+j;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Xyz obj=new Xyz();
obj.Sayhello("shiva");
System.out.println(obj.add(10,20));
	}

}
