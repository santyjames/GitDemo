import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Autosuggestivedropdownexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\Testing Software\\chromedriver_win32_Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String actualPlacename="Austria";
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys("Aus");
		Thread.sleep(2000);
		List<WebElement> places=driver.findElements(By.cssSelector("div.ui-menu-item-wrapper"));
		System.out.println("Number of elements:"+places.size());
		for(int i=0;i<places.size(); i++) {
			
			String placeName=places.get(i).getText();
			System.out.println("Place name:"+placeName);
			if(!(placeName.equals(actualPlacename))){
				Actions a= new Actions(driver);
				a.moveToElement(places.get(i)).sendKeys(Keys.DOWN).build().perform();
			}else {
				String expectedPlacename=places.get(i).getText();
				System.out.println("Expected Place Name:"+expectedPlacename);
				Assert.assertEquals(actualPlacename, expectedPlacename);
				
			}
	}

}
}