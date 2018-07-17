package page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocationsPage {
	WebDriver driver;
	
	public LocationsPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}	
	@FindBy(how=How.CLASS_NAME,using="location__name")
	WebElement locationName;
	
	@FindBy(how=How.CLASS_NAME,using="location__address")
	WebElement locationAddress;
	
	@FindBy(how=How.CLASS_NAME,using="location__distance")
	WebElement location_distance;
	
	@FindBy(how=How.CLASS_NAME,using="hours-list-item-wrapper hours-list--currentday")
	WebElement hours;
	
	public void printLocation() {	   
	   if (locationName.isDisplayed()&& (location_distance.isDisplayed())) {
		   System.out.println("Fisrt location title:\n" + locationName.getText());
		   System.out.println("Location distance: " + location_distance.getText() + "\n");
	   }
	}
	public void click_location(){
	   locationName.click();
	}
}
