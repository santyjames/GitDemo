import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Greenkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\Testing Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String[] itemsNeeded = { "Cucumber", "Brocolli" };
		List<WebElement> product = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int productNumber = product.size();
		addItem(driver,itemsNeeded,productNumber,product);
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//div[@class='cart-preview active']/div/button")).click();
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@class='promoCode']/following-sibling::button")).click();
		String message=driver.findElement(By.xpath("//input[@class='promoCode']/following-sibling::span")).getText();
		Assert.assertEquals(message, "Code applied ..!");
		driver.findElement(By.xpath("//div[@class='promoWrapper']/following-sibling::button")).click();
		

	}

	public static void addItem(WebDriver driver, String[] itemsNeeded, int productNumber, List<WebElement> product) {
		for (int i = 0; i < productNumber; i++) {
			String text = product.get(i).getText();
			String[] splitItemName = text.split("-");
			String formattedName = splitItemName[0].trim();
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			int j = 0;
			if (itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == 2)
					break;
			}

		}
	}

}
