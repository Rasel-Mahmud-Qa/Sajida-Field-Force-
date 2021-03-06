package Staff;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staff_New {

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
	 
	 
	       // First I have to click on menu item then only dropdown items will display
	 
	   
	 
	 
	 
	       // adding 2 seconds wait to avoid Sync issue
	 
	       Thread.sleep(2000);
	 
	 
	 
	       // Dropdown items are coming in <a> tag so below xpath will get all
	 
	       // elements and findElements will return list of WebElements
	 
	       List<WebElement> list = driver.findElements(By.xpath("//ul/li[@class='has-sub']/a/span"));
	 
	 
	 
	       //  using enhanced for loop to get the elements
	 
	       for (WebElement ele : list)
	 
	       {
	 
	          // for every elements it will print the name using innerHTML
	 
	          System.out.println("Values " + ele.getAttribute("innerHTML"));
	 
	 
	 
	          // Here we will verify if link (item) is equal to Java Script
	 
	          if (ele.getAttribute("innerHTML").contains("Staff")) {
	 
	             // if yes then click on link (iteam)
	 
	             ele.click();
	 
	 
	 
	             // break the loop or come out of loop
	 
	             break;
	 
	          }
	 
	       }
	     
	       driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]/span[1]")).click();
	       driver.findElement(By.name("user_name")).sendKeys("Rabbi");
	       driver.findElement(By.id("userid")).sendKeys("20021");
	       
	     
	      
	       Select usertype = new Select(driver.findElement(By.id("role_id")));
	       usertype.selectByValue("1");
	       usertype.selectByValue("2");
	       usertype.selectByValue("3");
	      
	       Select programtype = new Select(driver.findElement(By.id("business_program_id")));
	       programtype.selectByValue("1");
	       programtype.selectByValue("2"); 
	       
	       driver.findElement(By.name("designation")).sendKeys("Field Officer");
	       driver.findElement(By.name("email")).sendKeys("raihan@gmail.com");
	       driver.findElement(By.name("phone")).sendKeys("01763251325");
	       driver.findElement(By.name("appointment_type")).sendKeys("Permanent");
	      
	       Select depttype = new Select(driver.findElement(By.name("department_id")));
	       depttype.selectByValue("1");
	       
	      Select statustype = new Select(driver.findElement(By.name("status")));
	      statustype.selectByValue("0");
	       
	      driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/form[1]/input[2]")).click();
	      System.out.println("Staff Saved Successfully");
	      Thread.sleep(3000);
	      driver.close();
	   }
	 
	}