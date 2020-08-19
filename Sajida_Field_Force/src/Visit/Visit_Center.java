package Visit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Visit_Center {

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
	 
	          if (ele.getAttribute("innerHTML").contains("Visit")) {
	 
	             // if yes then click on link (iteam)
	 
	             ele.click();
	 	 
	             // break the loop or come out of loop
	  
	             break;
	 
	          }
	 
	       } 
	     
	       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]")).click();
	       Thread.sleep(300);
	       
	       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[4]/div[1]/ul[1]/li[3]/a[1]/span[1]")).click();
	       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/a[1]")).click();
	       
	       Select stg = new Select(driver.findElement(By.name("region_id")));
	       stg.selectByValue("5"); 
	       

	       Select atg = new Select(driver.findElement(By.name("area_id")));
	      atg.selectByValue("5"); 
	      
	       
}
}