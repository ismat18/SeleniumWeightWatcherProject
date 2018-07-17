package page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WeightWatcherHomePage {
	WebDriver driver;
	
	public WeightWatcherHomePage(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	@FindBy(how=How.CLASS_NAME,using="find-a-meeting")
	WebElement findAMeeting;
		
	public void validatehomepage(){
	   assertTrue(driver.getTitle().contains("Weight Loss Program, Recipes & Help | Weight Watchers"));
	   System.out.println("Weight Loss Program, Recipes & Help | Weight Watchers\n");
	}
   
	public void click_findAMeeting(){	
		findAMeeting.click();
	}
}
