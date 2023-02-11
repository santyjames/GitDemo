import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiseassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\Testing Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#checkBoxOption1")).click();
		String value=driver.findElement(By.xpath("//div[@class='right-align']/fieldset/legend/following-sibling::label[1]")).getText();
		driver.findElement(By.name("dropdown-class-example")).sendKeys(value);
		driver.findElement(By.id("name")).sendKeys(value);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String alertMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alertMessage);
		String [] formattedValue=alertMessage.split(","); // formattedValue[0]=Hello Option1
		
		                                                  //formattedValue[1]= share this practice page and share your knowledge
		
		String [] newValue=formattedValue[0].split(" ");//newValue[0] =Hello
		//newValue[1]=Option1
		
		System.out.println("Extracted Vale=" +newValue[1]);
		if(newValue[1].equalsIgnoreCase(value)) {
			System.out.println("Input and output value matches");
		}else {
			System.out.println("Value Mismatch");
		}
		
		
		
	}

}
