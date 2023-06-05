package enginecomponent;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.WebUtil;

public class Base  extends WebUtil {
	
	@BeforeMethod(alwaysRun=true)
	public void beforetest() {
		
		browserOpen(readProperty("browser"));
		browserMaximize();
		implicitWaitMethod(5);
		pageOpen(readProperty("url"));
		
	}
	


	@AfterMethod(alwaysRun=true)
	public void aftertest() {
		implicitWaitMethod(5);
		//browserClose();
	}

}
