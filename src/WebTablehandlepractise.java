import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablehandlepractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\Testing Software\\chromedriver_win32_Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		WebElement table=driver.findElement(By.xpath("//table[@class='table-display']"));
		int rowCount =table.findElements(By.tagName("tr")).size();
		System.out.println("Table row count is :"+rowCount);
		int columnCount=table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
		System.out.println("Table column count is :"+columnCount);
	    List<WebElement> secondRow=table.findElements(By.tagName("tr")).get(3).findElements(By.tagName("td"));
		System.out.println(secondRow.get(0).getText());
		System.out.println(secondRow.get(1).getText());
		System.out.println(secondRow.get(2).getText());

	}

}
