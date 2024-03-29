package code.bind;
/*
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
*/
public class App {
	public static void main(String[] args) {
		System.out.println("Sanjeev.codebind");

		System.setProperty("webdriver.chrome.driver", "C:\\Sanjeev_folder\\Software_folder\\chrome_driver_extension\\chromedriver.exe");
		/*
		WebDriver driver=new ChromeDriver();        
		

		driver.get("https://www.fundsindia.com/content/jsp/registration/login.jsp#SignIn");

		WebElement ele_email=driver.findElement(By.cssSelector("#userMailId"));
		WebElement ele_pwd=driver.findElement(By.cssSelector("#userPassword"));

		ele_email.sendKeys("sanjeev.pamho@gmail.com");

		ele_pwd.sendKeys("NGAE@123");

		WebElement ele_istclick=driver.findElement(By.cssSelector("button[class='btn2 btn btn-primary btn_signin']"));
		ele_istclick.click();

		WebElement ele_dob=driver.findElement(By.cssSelector("input[name='dobOrPan']"));

		ele_dob.sendKeys("04011992");


		WebElement ele_2ndclick=driver.findElement(By.cssSelector("input[value='Authenticate']"));
		ele_2ndclick.click();
		*/
		
		//driver.close();


	}


	public String Sample(){
		return "Sample";
	}
}
