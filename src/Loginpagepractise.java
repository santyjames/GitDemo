import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpagepractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\Testing Software\\chromedriver_win32_Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();
		driver.findElement(By.cssSelector("select.form-control")).click();
		Select s=new Select(driver.findElement(By.cssSelector("select.form-control")));
		s.selectByValue("consult");
		driver.findElement(By.id("signInBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
		
		List<WebElement>itemList=driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		int length=itemList.size();
		for(int i=0;i<length;i++) {
			
			itemList.get(i).click();
			
		}
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
	}

}
