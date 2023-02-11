import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendarpractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\Testing Software\\chromedriver_win32_Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();

//		driver.switchTo().frame("notification-frame-173058bbb");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']/i")));
//		driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']/i"))
//				.click();
//		driver.switchTo().defaultContent();
		String mon = "March 2023";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@class='makeFlex vrtlCenter ']/a")).click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("span[class='bgProperties icon20 overlayCrossIcon']")));
		driver.findElement(By.cssSelector("span[class='bgProperties icon20 overlayCrossIcon']")).click();
		driver.findElement(By.xpath("//div[@class='hsw_inputBox width160']//input[@id='departure']")).click();

		while(true) {
			String firstMonth=driver.findElement(By.xpath("(//div[@class='DayPicker-Month']//div[@class='DayPicker-Caption']/div)[1]")).getText().trim();
			if(firstMonth.equals("March 2023")) {
				System.out.println("Month as expected is:"+firstMonth);
				break;
			}
			else {
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				System.out.println("Montns are not matches:"+firstMonth);
			}
			
		}
		List<WebElement> days=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1] //div[@class='dateContainer']"));
		for(int i=0;i<days.size();i++) {
			if(days.get(i).getText().equals("15")) {
				days.get(i).click();
				break;
			}
		}
//		while (true) {
//			List<WebElement> month = driver
//					.findElements(By.xpath("//div[@class='DayPicker-Month']//div[@class='DayPicker-Caption']/div"));
//			String firstMonth = month.get(0).getText().trim();
//			System.out.println(firstMonth);
//			String secondMonth = month.get(1).getText().trim();
//			System.out.println(secondMonth);
//			if (firstMonth.equals(mon) || secondMonth.equals(mon)) {
//				break;
//			} else {
//
//				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
//			}
//		}
		
		

	}
}
