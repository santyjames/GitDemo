import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\Testing Software\\chromedriver_win32_Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.khanacademy.org/computer-programming/jquery-examples-drag-and-drop/6362163139706880");
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='_1op1mzcz']")));
		driver.findElement(By.xpath("//button[@class='_1op1mzcz']")).click();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(2);
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='output-frame']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'jQuery example: drag and drop')]")));
		WebElement source=driver.findElement(By.xpath("//html/body/img"));
		WebElement target=driver.findElement(By.xpath("/html[1]/body[1]"));
		//WebElement target=driver.findElement(By.xpath("//html/body/img/following-sibling::div"));
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target);
		
	}

}
