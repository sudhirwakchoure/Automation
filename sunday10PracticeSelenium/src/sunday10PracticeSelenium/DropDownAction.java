package sunday10PracticeSelenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownAction {

	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
//		WebElement e1 = driver.findElement(By.xpath("//select[@id='day']"));
//		
//		Select s1 = new Select(e1);
//		s1.selectByIndex(25);
//		
//		WebElement e2 = driver.findElement(By.id("month"));
//		
//		Select s2 = new Select(e2);
//		s2.selectByValue("9");
//		
//		WebElement e3 = driver.findElement(By.xpath("//select[@id='year']"));
//		Select s3 = new Select(e3);
//		
//		List<WebElement> elements  = s3.getOptions();
//		int count = elements.size();
//		
//		for(int i=0;i<count;i++) {
//			WebElement Element =elements.get(i);
//			String text = Element.getText();
//			System.out.println(text);
//		}
		
		//Actions a1 = new Actions(driver);
//		WebElement e1 =driver.findElement(By.id("draggable"));
//		WebElement e2 =driver.findElement(By.xpath("//div[@id='droppable']"));
//		
//		//a1.clickAndHold(e1).moveToElement(e2).release(e1).build().perform();
//		
//		a1.dragAndDrop(e1, e2);
//		
//		WebElement e3 =driver.findElement(By.id("field2"));
//		a1.sendKeys(e3,"Hemant Ahire").perform();
//		a1.sendKeys(Keys.PAGE_DOWN).perform();
//		
//		a1.doubleClick(e3).perform();
//		
//		WebElement e4 =driver.findElement(By.xpath("(//img[@width='100'])[1]"));
//		//a1.contextClick(e4).perform();
//		
//		
//		a1.sendKeys(Keys.PAGE_UP).perform();
//		
//		WebElement e5 = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
//		a1.click(e5).build().perform();
//		driver.switchTo().alert().accept();
////		
//		
//		Actions a1 = new Actions(driver);
//		WebElement e1= driver.findElement(By.xpath("//button[@id='confirmButton']"));
//		a1.click(e1).perform();
//		driver.switchTo().alert().dismiss();
//		
//		
		WebElement e1= driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		
		List<WebElement> elements= driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
		
		int count =elements.size();
		
		for(int i=0;i<count;i++) {
			
			WebElement element= elements.get(i);
			String text =element.getText();
			
			if(text.equals("Appium")) {
				element.click();
			}
			
		}
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}
	
}
