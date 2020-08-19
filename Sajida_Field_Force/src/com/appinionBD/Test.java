package com.appinionBD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		 
		 
	       // Start Chrome browser
	 
	       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	 
	 
	       // start the application
			driver.get("http://rnd.appinionbd.com/sajida-fieldforce/login");

			//Input valid user name and password
					driver.findElement(By.name("xe_username")).sendKeys("admin");
				    driver.findElement(By.name("xe_passwd")).sendKeys("mysff"); 
					driver.findElement(By.className("fa-lock")).click();
	
	 
	       Thread.sleep(2000);
	 
	       List<WebElement> list = driver.findElements(By.xpath("//ul/li[@class='has-sub']/a/span"));
	 
	 
	 
	       //  using enhanced for loop to get the elements
	 
	       for (WebElement ele : list)
	 
	       {
	 
	          // for every elements it will print the name using innerHTML
	 
	          System.out.println("Values " + ele.getAttribute("innerHTML"));
	 
	 
	 
	          // Here we will verify if link (item) is equal to Java Script
	 
	          if (ele.getAttribute("innerHTML").contains("Test Center")) {
	 
	             // if yes then click on link (iteam)
	 
	             ele.click(); 
	 	 
	             // break the loop or come out of loop
	  
	             break;
	 
	          }
	 
	       } 
	           
	      
}
}