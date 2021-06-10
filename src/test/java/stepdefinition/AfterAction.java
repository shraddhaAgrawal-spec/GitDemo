package stepdefinition;

import io.cucumber.java.After;
import utilities.BaseClass;

public class AfterAction {
@After
	public static void tearDown() {
		
		BaseClass.teardown();
	}
}
