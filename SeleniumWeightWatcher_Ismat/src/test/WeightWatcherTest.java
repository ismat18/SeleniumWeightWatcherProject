package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.FindAMeetingPage;
import page.FirstLocationPage;
import page.LocationsPage;
import page.WeightWatcherHomePage;
import util.BrowserFactory;

public class WeightWatcherTest {
	@Test
	public void WeightWatcherTest(){
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.weightwatchers.com/us/");
						
	WeightWatcherHomePage home = PageFactory.initElements(driver, WeightWatcherHomePage.class);
	home.validatehomepage();
	home.click_findAMeeting();
	
	FindAMeetingPage meeting = PageFactory.initElements(driver, FindAMeetingPage.class);
	meeting.validate_meetingpage();
	meeting.click_search();
	
	LocationsPage location = PageFactory.initElements(driver, LocationsPage.class);
	location.printLocation();
	location.click_location();
	
	FirstLocationPage firstLocation = PageFactory.initElements(driver, FirstLocationPage.class);
	firstLocation.validate_first_location();
	firstLocation.hoursOfOperation();
	
	driver.close();
	driver.quit();		
	}
}
