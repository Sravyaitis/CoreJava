package snippet;

public class Parent3Class {
	
	int a;
	
	public Parent3Class(int a2) {
		this.a=a2;
	}

	public int multiplyTwo() {
		a = a*2;
		return a; //3*2=6
	}
	
	public int multiplyThree() {
		a = a*3;
		return a; //3*6=18
	}
}
