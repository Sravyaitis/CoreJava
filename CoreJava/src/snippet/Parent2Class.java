package snippet;

public class Parent2Class extends Parent3Class{

	int a; //class variable
	public Parent2Class(int a) { //instance variable
		super(a); //parent class constructor is invoked
		this.a=a;
	}
	
	public int increment() {	
		a=a+1;
		return a;
	}
	
	public int decrement() {	
		a=a-1;
		return a;
	}
}
