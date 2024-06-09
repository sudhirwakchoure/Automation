package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Popups {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/alerts";
		System.setProperty("webdriver.chrome.driver", "D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);

		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
	
		WebElement e1 = driver.findElement(By.id("confirmButton"));
		e1.click();
		Thread.sleep(3000);
		String exptext = "Do you confirm action?";
		String text = driver.switchTo().alert().getText();
		if(text.equals(exptext)) {
		Thread.sleep(3000);
		System.out.println(text);
		driver.switchTo().alert().dismiss();
		}
		
		driver.quit();
		
		
	}
}
