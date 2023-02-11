import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\Testing Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement path =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select staticdropdown=new Select(path);
		staticdropdown.selectByIndex(3);
		System.out.println(staticdropdown.getFirstSelectedOption().getText());
		staticdropdown.selectByValue("INR");
		System.out.println(staticdropdown.getFirstSelectedOption().getText());
		staticdropdown.selectByVisibleText("AED");
		System.out.println(staticdropdown.getFirstSelectedOption().getText());
		
			
		

	}

}
