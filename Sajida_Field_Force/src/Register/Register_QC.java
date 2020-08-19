package Register;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_QC {
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
	 
	          if (ele.getAttribute("innerHTML").contains("Register")) {
	 
	             // if yes then click on link (iteam)
	 
	             ele.click();
	 	 
	             // break the loop or come out of loop
	 
	             break;
	 
	          }
	 
	       } 
	     
	       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]/span[1]")).click();
	       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/a[4]")).click();
	       driver.navigate().back();
    }
}

