import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name= "Cyra";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\Testing Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		String password=restPassword(driver);
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div/p")).getText());
		String Actualname=driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
		System.out.println(Actualname);
		Assert.assertEquals(driver.findElement(By.xpath("//div/p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(Actualname, "Hello "+name+",");
		driver.findElement(By.xpath("//div/button")).click();
	}
	
	public static String restPassword(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(By.linkText("Forgot your password?")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Cyra");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("cyraceline@gmail.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("cyra@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9288150330");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String resetPassword =driver.findElement(By.cssSelector("form p")).getText();
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		Thread.sleep(1000);
		System.out.println(resetPassword);
		//Please use temporary password 'rahulshettyacademy' to Login.
		String [] PasswordArray=resetPassword.split("'");
		String [] passwordArray2=PasswordArray[1].split("'");
		String Password=passwordArray2[0];
		return Password;
		
	}

}
