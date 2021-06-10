package stepdefinition;

import io.cucumber.java.Before;
import utilities.BaseClass;

public class BeforeActions {
	@Before
	public static void setUp() {
			//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
	    	System.out.println("Before");
	      BaseClass.setUPDRiver();
}
}
