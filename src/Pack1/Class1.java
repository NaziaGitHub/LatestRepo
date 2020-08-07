package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 
{
	WebDriver driver;
	public void OpenBrowser()
	{
	  System.setProperty("webdriver.chrome.driver","D:\\Desktop and Download Data\\Backup Data\\Chrome Driver New\\ChromeDriver83\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	}
	public void SendKeys1()
	{
	 driver.findElement(By.id("email")).sendKeys("test@test.com");
	}
	public void SendKeys2()
	{
	 driver.findElement(By.id("pass")).sendKeys("test@123");
	}
	public void LoginClick()
	{
	  driver.findElement(By.xpath("//input[contains(@id,'u_0_')]")).click();
	}
}
