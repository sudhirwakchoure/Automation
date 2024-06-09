package sunday10PracticeSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Basics2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	    
	    driver.get("http://www.facebook.com/signup");
//	    String expTitle = "Sign up for Facebook | Facebook";
//	    String title= driver.getTitle();
//	    System.out.println("the current title is "+title);
//	    if(expTitle.equals(title)) {
//	    	System.out.println("Test Pass");
//	    }
//	    else
//	    {
//	    	System.out.println("Test Fail");
//	    }
//	    
//	    String url =driver.getCurrentUrl();
//	    System.out.println("the current url is "+url);
//	    
//	    int w1=driver.manage().window().getSize().getWidth();
//	    int h1=driver.manage().window().getSize().getHeight();
//	    System.out.println("Width is "+w1 + " Height is "+h1);
//	    
//	    Dimension set = new Dimension(688,372);
//	    driver.manage().window().setSize(set);
//	    
//	    Point points= driver.manage().window().getPosition();
//	    int x=points.getX();
//	    int y=points.getY();
//	    System.out.println(x+" , "+y);
//	    
//	    Point set2 = new Point(688,372);
//	    driver.manage().window().setPosition(set2);
//	    Point current =driver.manage().window().getPosition();
//	    System.out.println(current.x+" , "+current.y);
//	    
//	    
//	    
//	    
	    
	    
	    TakesScreenshot s = (TakesScreenshot)driver;
	    File src =s.getScreenshotAs(OutputType.FILE);
	    File des = new File("D:\\SM\\"+System.currentTimeMillis()+".png");
	    FileHandler.copy(src,des);
	    
	    WebElement e1= driver.findElement(By.xpath("//select[@id='month']"));
	    File  src1 = e1.getScreenshotAs(OutputType.FILE);
	    File des1 = new File("D:\\SM\\"+System.currentTimeMillis()+".png");
	    FileHandler.copy(src1, des1);
	    
	    
	    Thread.sleep(3000);
	    driver.quit();
	
	
	}
}
