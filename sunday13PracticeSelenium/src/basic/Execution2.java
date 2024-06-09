package basic;

public class Execution2 extends LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		Execution2 obj = new Execution2();
		obj.launchBrowser();

		String expTitle = "Facebook – log in or sign up";
		String actTitle = driver.getTitle();
		if(actTitle.equals(expTitle)) {
			
			System.out.println("TITLE IS MATCH" + actTitle);
			
		}
		else {
			System.out.println("TITLE NOT MATCH "+ actTitle);
		}
		
		String actUrl = driver.getCurrentUrl();
		if(url.equals(actUrl)) {
			System.out.println("actual url match " + actUrl);
		}
		else {
			System.out.println("actual url not match " + actUrl);
		}
		 Thread.sleep(3000);
		driver.close();
		
		
	}
}
