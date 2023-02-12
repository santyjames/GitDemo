import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Invoking Browser
		// Chrome --- ChromeDriver Class having methods which will help to automate in chrome browser
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Testing Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Test 1");
		System.out.println("Test 2");
		
		
		
	}

}
