package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	private static WebDriver driver;
	private static BaseClass baseclass;
	private static WebDriverWait waits;
	public static int TIME_OUTS =30;

	@SuppressWarnings("deprecation")
	public BaseClass() {

	//	WebDriverManager.chromeDriver.setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pulki\\eclipse-workspace\\Banking\\src\\test\\resources\\executables\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TIME_OUTS, TimeUnit.SECONDS);
		waits = new WebDriverWait(driver, TIME_OUTS);
	}

	public static void openURL(String URL) {
		driver.get(URL);
	}

	public static WebDriver driver() {
		return driver;

	}
	public static void setUPDRiver() {
		if(baseclass==null) {

			baseclass=new BaseClass();
			
		}
	}
	public static void teardown() {
		if(baseclass!=null) {
			driver.close();
			driver.quit();
		}
		baseclass=null;
	}
}
