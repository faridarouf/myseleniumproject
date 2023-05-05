package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MegaBus {
  @Test
  public void f() throws InterruptedException {
WebDriver driver;
driver=new ChromeDriver();
driver.get("https://us.megabus.com/account-management/login");
Thread.sleep(5000);
driver.findElement(By.linkText("Sign up")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@id='confirmEmail']")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("//input[@id='choosePassword']")).sendKeys("Abc@1234");
driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Abc@1234");
//First Checkbox
		WebElement element = driver.findElement(By.xpath("//input[@name='termsAndPrivacy']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",element);
		Thread.sleep(5000);




driver.quit();


  }
}
