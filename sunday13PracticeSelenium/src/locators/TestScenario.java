package locators;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class TestScenario extends LaunchBrowser{

	public static void main(String[] args) throws InterruptedException, IOException {
		TestScenario obj = new TestScenario();
		obj.launchBrowser();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement e1 = driver.findElement(By.name("firstname"));
		e1.sendKeys("Hemant");
	
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ahire");
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("hemantahire2609@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("hemantahire2609@gmail.com");
		
		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("Hemant@123");
		
		
		WebElement e2= driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s1 = new Select(e2);
		s1.selectByIndex(25);
		
		WebElement e3 = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s2 = new Select(e3);
		s2.selectByValue("9");
		
		WebElement e4 = driver.findElement(By.xpath("//select[@id='year']"));
		Select s3 = new Select(e4);
		s3.selectByVisibleText("1997");
		
		
		List<WebElement> option = s3.getOptions();
	    int  size = option.size();
		System.out.println(size);
	    
		for(int i=0;i<118;i++) {
			
			WebElement element= option.get(i);
			String optiondata = element.getText();
			System.out.println(optiondata);
			
		}
		
		String path="D:\\SM\\hemant.png";
		
		File ss =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f = new File(path);
		FileHandler.copy(ss, f);
	    
		
		
		WebElement e5=driver.findElement(By.xpath("//label[text()='Male']"));
		File ss1 = e5.getScreenshotAs(OutputType.FILE);
		File f1 = new File("D:\\SM\\hemant2.png");
		FileHandler.copy(ss1,f1);
		
		//1way
		int Height = driver.manage().window().getSize().getHeight();
	    int Width = driver.manage().window().getSize().getWidth();
		System.out.println(Width);
		System.out.println(Height);
		
		//2nd way
		
		Dimension size1= driver.manage().window().getSize();

		System.out.println(size1.getWidth());
		System.out.println(size1.getHeight());
		
		Thread.sleep(2000);
		
		//to set size
		Dimension set = new Dimension(688,377);
		driver.manage().window().setSize(set);
		
		Thread.sleep(2000);
		
		//to get position
		
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		//to set position
		
		Point set1 = new Point(688,377);
		driver.manage().window().setPosition(set1);
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}
}
