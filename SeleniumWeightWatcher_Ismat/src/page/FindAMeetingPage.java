package page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindAMeetingPage {
	WebDriver driver;
	
	public FindAMeetingPage(WebDriver ldriver){
		this.driver=ldriver;
	}
		
	@FindBy(how=How.ID,using="meetingSearch")
	WebElement search;
	
	@FindBy(how=How.CLASS_NAME,using="input-group-btn")
	WebElement search_btn;
   
	public void validate_meetingpage(){
	   assertTrue(driver.getTitle().contains("Get Schedules & Times Near You"));
	   System.out.println("Get Schedules & Times Near You\n");
	}
	public void click_search(){
	   search.sendKeys("10011");
	   search_btn.click();
	}
}
