package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebUtil extends FileUtil{
	

	public static WebDriver driver = null;

	WebElement element = null;
	

	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports reports;
	public static ExtentTest test;
	

	public static void startReport() {
		htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/AutomationTestReport.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlreporter);
	}

	public static void stopReport() {
		reports.flush();
	}
  
	

		public static boolean browserOpen(String name) {
			boolean flag = false;
			try {
				switch (name) {
				case "Chrome":
					WebDriverManager.chromedriver().setup();
				   	driver = new ChromeDriver();
					flag = true;
					break;
				case "Edge":
					WebDriverManager.edgedriver().setup();
				   	driver = new EdgeDriver();
					flag = true;
					break;
				case "Firefox":
					WebDriverManager.firefoxdriver().setup();
				   	driver = new FirefoxDriver();
					flag = true;
					break;
				case "Safari":
					WebDriverManager.safaridriver().setup();
				   	driver = new SafariDriver();
					flag = true;
					break;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return flag;
			}
	
	public void browserMaximize() {
		driver.manage().window().maximize();
	}

	public void implicitWaitMethod(int timer) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timer));
	}

	public void explicitWaitMethod(WebElement ele, int timer) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timer));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public void pageOpen(String websitelink) {
		driver.get(websitelink);
	}

	public void browserClose() {
		driver.close();
	}
	
	public void sendKeysMethod(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	
	public void clearMethod(WebElement ele) {
		ele.clear();
	}

	public void eleClick(WebElement ele) {
		ele.click();
	}
	
//	public String eleClickWithSendKeys(WebElement ele, String sendkeyvalue) {
//		ele.click().sendKeys(sendkeyvalue);
//		ele.sendKeys(sendkeyvalue);
//	}
	
	public boolean isPresentMethod(WebElement ispresentvalue) {
		 boolean ispresentreturnvalue = ispresentvalue.isDisplayed();
		 return  ispresentreturnvalue;
	}
	
	public String getTextMethod(WebElement gettextvalue) {
		String returnvalue =  gettextvalue.getText();
		return returnvalue;
	}
	
	public void dropDownMethodWithVisibleText(WebElement dropdownelement, String visibletext) {
		Select sel = new Select(dropdownelement);
		sel.selectByVisibleText(visibletext);
		
	}
	
	public void dropDownMethodWithIndex(WebElement dropdownelement, int byindex) {
		Select sel = new Select(dropdownelement);
		sel.selectByIndex(byindex);
	}
	
	public void dropDownMethodWithValue(WebElement dropdownelement, String value) {
		Select sel = new Select(dropdownelement);
		sel.selectByValue(value);
	}
	
	public String getCurrentUrlMethod() {
		String currenturl = driver.getCurrentUrl();
		return currenturl;
	}
	
	public String getTitleMethod() {
		
		 String gettitlevalue = driver.getTitle();
		 return gettitlevalue;
	}
	
	public void listElementsMethod(List<WebElement> ele) {
		
		for(WebElement lists : ele ) {
			
			//int size = lists.getSize();
			//Object size = lists.getSize();
			//System.out.println(lists.getSize());
			//System.out.println(size);
			
			String value = lists.getText();
			//System.out.println(value);
			}  
	
		}

	 public static String getScreenShot(String screenshotName) throws IOException {
			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination);
			return destination;
		}
	

}
