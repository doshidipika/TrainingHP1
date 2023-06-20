package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session1 {

	public static void main(String[] args) {
	//System.out.println("My First Java Code");
		//System.setProperty("webdriver.chrome.driver", " ‪D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.navigate().to("https://www.facebook.com");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().to("https://www.yahoo.com");
driver.close();

//driver.findElement(By.className("hXhhq")).isDisplayed();
/*String website = driver.getCurrentUrl();
System.out.println("Website Name is= "+website);*/

//System.setProperty("webdriver.geckodriver.driver", "‪D:\\Selenium\\geckodriver-v0.33.0-win32\\geckodriver.exe");
	}

}
