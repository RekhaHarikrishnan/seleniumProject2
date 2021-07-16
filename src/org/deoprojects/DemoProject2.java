package org.deoprojects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoProject2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ranjithrekha\\eclipse-workspace\\SeleniumLocators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);

		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		signIn.click();
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[2]"));
		email.sendKeys("vibin123@gmail.com");
		
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.name("passwd"));
		password.sendKeys("jenishaa");
		
		Thread.sleep(10000);

		WebElement logIn = driver.findElement(By.name("SubmitLogin"));
		logIn.click();
		
		Actions a = new Actions(driver);
		
		Thread.sleep(5000);
		
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		a.moveToElement(women).build().perform();
		
		//right click the tops to inspect the code here
		
		WebElement tops = driver.findElement(By.xpath("//a[text()='Tops']"));
		tops.click();
		
		Thread.sleep(10000);
		
		WebElement image = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		image.click();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(20000);
		
		WebElement addToCart = driver.findElement(By.xpath("//button[@class='exclusive']"));
		addToCart.click();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(10000);
		
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed.click();
		
		Thread.sleep(10000);
		
		WebElement proceed1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceed1.click();
		
		Thread.sleep(10000);
		
		WebElement proceed2 = driver.findElement(By.name("processAddress"));
		proceed2.click();
		
		Thread.sleep(10000);
		
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkBox.click();
		
		Thread.sleep(10000);
		
		WebElement proceed3 = driver.findElement(By.name("processCarrier"));
		proceed3.click();
		
		Thread.sleep(10000);	
		
		WebElement bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
		bank.click();
		
		Thread.sleep(10000);	
		
		WebElement confirm = driver.findElement(By.xpath(("(//button[@type='submit'])[2]")));
		confirm.click();
		
		TakesScreenshot t = (TakesScreenshot)driver;
	       File source = t.getScreenshotAs(OutputType.FILE);
	       File destination = new File("C:\\Users\\ranjithrekha\\eclipse-workspace-new\\SeleniumMiniProject2\\Screenshot/index.php.png");
	        
	       FileUtils.copyFileToDirectory(source, destination);
	       

	}

}
