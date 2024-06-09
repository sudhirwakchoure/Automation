package saturday19practiceformock;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class AllInOne {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
     	driver.manage().deleteAllCookies();
//		driver.get("https://jqueryui.com/droppable/");
     	driver.get("https://facebook.com/signup");
		Thread.sleep(3000);
//		driver.navigate().to("http://www.instagram.com");
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		Thread.sleep(3000);
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("http://www.facebook.com");
//		Thread.sleep(3000);
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("http://www.instagram.com");
//		String exptitle = "Sign up for Facebook | Facebook";
//		String actualtitle = driver.getTitle();
//		if(exptitle.equals(actualtitle)) {
//			System.out.println(actualtitle);
//		}
//		else {
//			System.out.println(exptitle+" it should be title");
//		}
//		String expectedurl = "https://www.facebook.com/signup";
//		String currenturl = driver.getCurrentUrl();
//		if(expectedurl.equals(currenturl)) {
//		System.out.println(currenturl);
//		}
		
		/*
		 * findElement and findElements
		 * 
		 * tagname
		 * id
		 * name
		 * classname
		 * text
		 * linkText
		 * partial link text
		 * xpath absolute and relative
		 * 
		 * 
		 * //tagname
		   //tagname[index]/tagname
		 * // tagname[index]/tagname[index]
		   (//xpath) [index]
		 *  //tagname[@attributename='attributevalue']
		 *  //tagname[text()='text']
		 *  //tagname[contains(@attribute,'attributevalue')]
		 *   //tagname[contains(text(),'tex')]
		 *  
		 */
//	
//		  Dimension size = driver.manage().window().getSize();
//		  int h = size.getHeight();
//		  int w= size.getWidth();
//		  System.out.println(h + " "+ w );
//		  
//		  Point position = driver.manage().window().getPosition();
//		  System.out.println( position.getX()+" "+ position.getY() );
//		  
//		  Dimension set = new Dimension(500, 300);
//		  driver.manage().window().setSize(set);
//		  Point setp = new Point(650,350);
//		  driver.manage().window().setPosition(setp);
//		  
//		  
//		JavascriptExecutor j = (JavascriptExecutor)driver;
//		j.executeScript("scroll(0,2100)");
//		
//		String parentid= driver.getWindowHandle();
//		
//		driver.switchTo().frame("a077aa5e");
//		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
//		
//		Set<String> parentchildid = driver.getWindowHandles();
//		Thread.sleep(3000);
//		for(String i : parentchildid) {
//			if(!i.equals(parentid)) {
//				driver.switchTo().window(i);
//				driver.findElement(By.xpath("(//img[@class='custom-logo'])[1]")).click();
//			    Thread.sleep(3000);
//			    driver.close();
//			}
//			
//		}
//		
//		driver.switchTo().window(parentid);
//		
//		j.executeScript("scroll(0,-2100)");
//		
//		Thread.sleep(3000);
//		WebElement e1 = driver.findElement(By.xpath("//img[@src='../img/logo.png']"));
//		e1.click();
//		
//		
//		TakesScreenshot ss = (TakesScreenshot)driver;
//		File screenshot = ss.getScreenshotAs(OutputType.FILE);
//		File f =new File("D:\\SM\\study materials\\automation testing\\Advanced  selenium\\hemant.png"); 
//		FileHandler.copy(screenshot, f);
//		
//		WebElement e1 =driver.findElement(By.xpath("//select[@id='day']"));
//		File s1 =e1.getScreenshotAs(OutputType.FILE);
//		File f1 = new File("D:\\SM\\study materials\\automation testing\\Advanced  selenium\\ahemant.png"); 
//		FileHandler.copy(s1, f1);
//		
//		
//		Actions a1 = new Actions(driver);
//		driver.switchTo().frame(0);
//	    WebElement e1 = driver.findElement(By.id("draggable"));	
//		WebElement e2 = driver.findElement(By.id("droppable"));
//		//a1.clickAndHold(e1).moveToElement(e2).release(e1).build().perform();
//		a1.dragAndDrop(e1, e2).build().perform();
//		driver.switchTo().parentFrame();
//		
//		WebElement e3 = driver.findElement(By.xpath("//input[@class='ds-input']"));
////		a1.click(e3).perform();
////		a1.contextClick(e3).perform();
////		a1.doubleClick(e3).perform();
////		a1.sendKeys("Hemant").perform();
//		a1.sendKeys(Keys.PAGE_DOWN).perform();
//		a1.sendKeys(Keys.PAGE_DOWN).perform();
//		a1.sendKeys(Keys.PAGE_DOWN).perform();
//		a1.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(3000);
//		a1.sendKeys(Keys.PAGE_UP).perform();
//		a1.sendKeys(Keys.PAGE_UP).perform();
//		a1.sendKeys(Keys.PAGE_UP).perform();
//		a1.sendKeys(Keys.PAGE_UP).perform();
		
		
		WebElement e1 = driver.findElement(By.xpath("//select[@id='day']"));
		Select s1 = new Select(e1);
		List<WebElement>  option = s1.getOptions();
		int count = option.size();
        for(int i = 0; i<count;i++) {
        	WebElement e = option.get(i);
        	String s= e.getText();
        	System.out.println(s);
        }
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
