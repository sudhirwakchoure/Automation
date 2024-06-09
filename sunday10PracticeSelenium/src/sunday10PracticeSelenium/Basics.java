package sunday10PracticeSelenium;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

	public static void main(String[] args) throws InterruptedException {
		
		//launch browser
		
		System.setProperty("webdriver.chrome.driver","D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","path+file name with extension");
		//System.setProperty("webdriver.edge.driver","path+file name with extension");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDrive();
//		//WebDriver driver = new EdgeDriver();
//		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com/signup");
//		driver.navigate().to("http://www.instagram.com");
////		Thread.sleep(3000);
////		driver.navigate().back();
////		Thread.sleep(3000);
////		driver.navigate().forward();
////		Thread.sleep(3000);
////		driver.navigate().refresh();
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("http://www.facebook.com");
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("http://www.amazon.com");
//		String title = driver.getTitle();
//		System.out.println(title);
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.selenium.dev/");
//		String Text =driver.findElement(By.xpath("(//a[@class='nav-link'])[3]")).getText();
//		System.out.println(Text);
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("http://www.facebook.com");
//	     
//		Set<String> windows = driver.getWindowHandles();
//		
//		ArrayList<String> seq = new ArrayList<String>(windows);
//		
//		String Window1 = seq.get(0);
//		String Window2 = seq.get(1);
//		String Window3 = seq.get(2);
//		String Window4 = seq.get(3);
//		String Window5 = seq.get(4);
//		
//		driver.switchTo().window(Window3);
//		driver.close();
//		driver.switchTo().window(Window1);
//		driver.close();
//		
		
		
		
		
		
		
		
		
	}
}
