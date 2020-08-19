package Office;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Office_Manage_Center {
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
	 
	          if (ele.getAttribute("innerHTML").contains("Office")) {
	 
	             // if yes then click on link (iteam)
	 
	             ele.click();
	 	 
	             // break the loop or come out of loop
	 
	             break;
	 
	          }
	 
	       } 
	     
	       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[6]/ul[1]/li[2]/a[1]/span[1]")).click();
	       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/a[2]")).click(); 
	       
	       driver.findElement(By.name("center_name")).sendKeys("Banani");
	       driver.findElement(By.name("center_bn_name")).sendKeys("Banani");
	       
	       driver.findElement(By.name("center_code")).sendKeys("R22200");
	       
	       Select selectFO = new Select(driver.findElement(By.id("fo_id")));
	       selectFO.selectByValue("354");
	       
	       Select branch = new Select(driver.findElement(By.id("branch_id")));
	       branch.selectByValue("7");
	       
	       driver.findElement(By.name("address")).sendKeys("Banani, Dhaka");
	       
	       Select statustype = new Select(driver.findElement(By.id("status")));
	       statustype.selectByValue("1");
	       
	      driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/form[1]/button[1]")).click();
 }
}


