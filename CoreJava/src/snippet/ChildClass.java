package snippet;

import org.testng.annotations.Test;

public class ChildClass extends Parent1Class{


	
	@Test
	public void testRun() {

		doThis();
		
		Parent2Class p2c=new Parent2Class(3);
		int a =3;
		System.out.println(p2c.increment());
		System.out.println(p2c.decrement());
		System.out.println(p2c.multiplyTwo());
		System.out.println(p2c.multiplyThree());
	}

}
