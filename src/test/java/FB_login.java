import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;

public class FB_login {
	@Test
	public void f() {
//create webdriver object
		WebDriver driver;
//open Any browser
		driver = new ChromeDriver();
//Type FB URL
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sonia@gmail.com");

		driver.findElement(By.name("password")).sendKeys("test12322323");
		driver.findElement(By.name("login")).click();
	}
}
