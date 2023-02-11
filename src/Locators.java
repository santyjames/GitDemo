import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\Testing Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("cyra");
		driver.findElement(By.name("inputPassword")).sendKeys("2424");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	    String errorMessage=driver.findElement(By.cssSelector("p[class='error']")).getText();
	    System.out.println("Error Message is :" +errorMessage);
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Cyra");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("cyraceline@gmail.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("cyra@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9288150330");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String resetMessage =driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(resetMessage);
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("cyra");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); // regular expression
	}

}
