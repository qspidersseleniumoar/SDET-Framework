package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		
		WebElement wb = driver.findElement(By.name("user_name"));
		//driver.navigate().refresh();
		
		wb.sendKeys("add");
		

	}

}
