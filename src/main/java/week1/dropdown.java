package week1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdown {

	public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
	// wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement Dropdown = driver.findElement(By.id("dropdown3"));
		Select DD= new Select(Dropdown);
		List<WebElement> options = DD.getOptions();
		int count=options.size();
		System.out.println(count);
		System.out.println(DD.getAllSelectedOptions());
		System.out.println(DD.getFirstSelectedOption().getText());
	    for (WebElement eachoption : options) {
			
	    	System.out.println(eachoption.getText());
	    	
	    		    	
		}
		
		DD.selectByIndex(count-1);
	    driver.quit();
	    
	    String m = "12345";
    	Integer a = Integer.parseInt(m);
    	System.out.println(a);
    	
	
		
		

	}

}
