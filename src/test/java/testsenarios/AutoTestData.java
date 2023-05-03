package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoTestData {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  driver = new ChromeDriver();
	  driver.get("https://autotestdata.com/");
	  //Run this program using CrossBrowser Testing
	  // Select "Country" value from Addmore dropdown 
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div[2]/div/button/div/div/div")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.id("bs-select-6-8")).click();
//	  then Click on Add button  
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div[3]")).click();

//	  Choose "Excel" radio button under "Choose Data format"
	  driver.findElement(By.id("exampleRadios10")).click();

//	  Go to "Number of Rows" edit box, clear existing number and type 15 there
	  driver.findElement(By.id("total-rows-gen")).clear();
	  driver.findElement(By.id("total-rows-gen")).sendKeys("15");
	  
	  
//	  Click on Generate button
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div[2]/div")).click();
	  Thread.sleep(5000);
//	  Click on Download button
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/button")).click();

	 
	
  }
}
