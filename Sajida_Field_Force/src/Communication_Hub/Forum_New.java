package Communication_Hub;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Forum_New {


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
	 
	          if (ele.getAttribute("innerHTML").contains("Communication Hub")) {
	 
	             // if yes then click on link (iteam)
	 
	             ele.click();
	 	 
	             // break the loop or come out of loop
	  
	             break;
	 
	          }
	 
	       } 
	     //Forum Page
	     driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[1]/a[1]/span[1]")).click();
	     
	     //Add New Forum
	     driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[3]/div[1]/a[1]")).click();
	     
	     //Create_Forum
	     driver.findElement(By.name("title")).sendKeys("Create New Forum"); //Post Title
	     
	     
	     Select programtype = new Select(driver.findElement(By.id("role_id")));   //Select Users
	       programtype.selectByValue("2"); 
	       programtype.selectByValue("3"); 
	       programtype.selectByValue("4");
	       programtype.selectByValue("5"); 
	       
	       
	   driver.findElement(By.id("description")).sendKeys("Test");
	       
	   driver.findElement(By.className("/html[1]/body[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]")).click();
	     
	 
	       
	       Thread.sleep(300);
	       driver.close();

	       
}
}