package Constructor;
class Parent{
	Parent(){
		this(10);
	System.out.println("from parent class");
}

	Parent(int x){
		System.out.println("from parent parameter comstructor");
	}
}
public class ConstrutorDemo extends Parent {

		ConstructorDemo() {
			
		
			System.out.println("from the child class");
		}
		ConstructorDemo(int x) {
		
			System.out.println("from the child parameter class");
		}
		ConstructorDemo(int x,int y) {
			System.out.println("from the child parameter1 class");
		}

		public static void main(String[] args) {
			ConstructorDemo obj=new ConstructorDemo();
			
	}
}

