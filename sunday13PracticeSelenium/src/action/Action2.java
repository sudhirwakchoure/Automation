package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {

	public static void main(String[] args) {
		String url ="https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html";
		
		System.setProperty("webdriver.chrome.driver", "D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	
		
		Actions a1 = new Actions(driver);
		
		WebElement e1 = driver.findElement(By.xpath("//button[contains(text(),'Automation Tools')]"));
		a1.moveToElement(e1).perform();
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));

		int size = elements.size();
		System.out.println(size);
	
		for(int i=0;i<size;i++) {
		WebElement element = elements.get(i);
		String attribute =  element.getAttribute("innerHTML");
		System.out.println(attribute);
		if(attribute.equals("TestNG")) {
			a1.click(element).perform();
			break;
		}
			
		}
		
	
	}
}
