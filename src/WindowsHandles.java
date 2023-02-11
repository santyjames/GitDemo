import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\Testing Software\\chromedriver_win32_Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();// we will get sequence of ParentID, ChildID 
		Iterator<String> Id =windows.iterator();
		String parentID=Id.next();
		String ChildId=Id.next();
		driver.switchTo().window(ChildId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String value =driver.findElement(By.cssSelector(".im-para.red")).getText();
		String [] formattedValue=value.split("at");//{"Please email us at" ," mentor@rahulshettyacademy.com with below template to receive response"}
		String [] againformattedValue= formattedValue[1].split("with"); //{" mentor@rahulshettyacademy.com "," below template to receive response"}
		System.out.println(againformattedValue[0].trim());
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(againformattedValue[0].trim());
	}

}
