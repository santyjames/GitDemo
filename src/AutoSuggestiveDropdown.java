import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\Testing Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);
	
	    List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	   System.out.println(options.size());

	    for(WebElement option :options) {
	    	if(option.getText().equalsIgnoreCase("India")) {
	    		option.click();
	    		break;
	    	}
	    }
	}

}
