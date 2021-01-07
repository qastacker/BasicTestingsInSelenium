package techBeamers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		

	}

}
