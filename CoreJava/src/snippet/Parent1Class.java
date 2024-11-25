package snippet;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Parent1Class {

	public void doThis() {
		System.out.println("Im here");
	}
	
	@BeforeTest
	public void beforeRun() {
		System.out.println("Run me first");
	}
	
	@AfterTest
	public void afterRun() {
		System.out.println("Run me last");
	}

}
