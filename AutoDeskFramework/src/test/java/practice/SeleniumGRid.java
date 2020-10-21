package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGRid {
	@Test
	public void crateCoantact() throws Throwable {
		
		URL url = new URL("http://192.168.1.152:4444/wd/hub");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		
		RemoteWebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("http://gmail.com");
	}

}
