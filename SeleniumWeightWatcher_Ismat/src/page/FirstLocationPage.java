package page;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FirstLocationPage {
WebDriver driver;
	
	public FirstLocationPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	@FindBy(how = How.XPATH, using = "//div[text()='NEW YORK, NY 10010']")
	WebElement firstLocation;

	@FindBy(how = How.XPATH, using = "//h2[text()='Hours of Operation']")
	WebElement time;

	@FindBy(how = How.XPATH, using = "//div[text()='Sunday']")
	WebElement Sun;
	@FindBy(how = How.XPATH, using = "//div[text()='10:00 AM – 1:00 PM']")
	WebElement SunTime;

	@FindBy(how = How.XPATH, using = "//div[text()='Monday']")
	WebElement Mon;
	@FindBy(how = How.XPATH, using = "//div[text()='7:45 AM – 9:15 AM']")
	WebElement MonTime1;
	@FindBy(how = How.XPATH, using = "//div[text()='12:00 PM – 2:00 PM']")
	WebElement MonTime2;
	@FindBy(how = How.XPATH, using = "//div[text()='5:30 PM – 7:00 PM']")
	WebElement MonTime3;

	@FindBy(how = How.XPATH, using = "//div[text()='Tuesday']")
	WebElement Tues;
	@FindBy(how = How.XPATH, using = "//div[text()='8:00 AM – 2:00 PM']")
	WebElement TuesTime1;
	@FindBy(how = How.XPATH, using = "//div[text()='4:45 PM – 8:00 PM']")
	WebElement TuesTime2;

	@FindBy(how = How.XPATH, using = "//div[text()='Wednesday']")
	WebElement Wed;
	@FindBy(how = How.XPATH, using = "//div[text()='9:30 AM – 2:00 PM']")
	WebElement WedTime1;
	@FindBy(how = How.XPATH, using = "//div[text()='5:00 PM – 8:00 PM']")
	WebElement WedTime2;

	@FindBy(how = How.XPATH, using = "//div[text()='Thursday']")
	WebElement Thurs;
	@FindBy(how = How.XPATH, using = "//div[text()='7:45 AM – 10:30 AM']")
	WebElement ThursTime1;
	@FindBy(how = How.XPATH, using = "//div[text()='11:45 AM – 2:00 PM']")
	WebElement ThursTime2;
	@FindBy(how = How.XPATH, using = "//div[text()='4:45 PM – 8:00 PM']")
	WebElement ThursTime3;

	@FindBy(how = How.XPATH, using = "//div[text()='Friday']")
	WebElement Fri;
	@FindBy(how = How.XPATH, using = "//div[text()='7:45 AM – 9:30 AM']")
	WebElement FriTime1;
	@FindBy(how = How.XPATH, using = "//div[text()='11:45 AM – 2:00 PM']")
	WebElement FriTime2;
	@FindBy(how = How.XPATH, using = "//div[text()='2:30 PM – 4:30 PM']")
	WebElement FriTime3;

	@FindBy(how = How.XPATH, using = "//div[text()='Saturday']")
	WebElement Sat;
	@FindBy(how = How.XPATH, using = "//div[text()='8:00 AM – 1:00 PM']")
	WebElement SatTime;
   
	public void validate_first_location(){
	   assertTrue(driver.getTitle().contains(firstLocation.getText()));
	   System.out.println("This is your nearest location, Take an appointment!\n");  
	}
	
	
	public void hoursOfOperation() {
		
		// getting current date time using calendar class
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK);

		System.out.println("Today's Hours of Operation: \n");
		
		switch (day) {
		case Calendar.SUNDAY: //Current day is Sunday
			System.out.println("SUNDAY");
			System.out.println(SunTime.getText());
			break;

		case Calendar.MONDAY: //Current day is Monday
			System.out.println("MONDAY");
			System.out.println(MonTime1.getText());
			System.out.println(MonTime2.getText());
			System.out.println(MonTime3.getText());
			
			break;
		case Calendar.TUESDAY: //Current day is Tuesday
			System.out.println("TUESDAY");
			System.out.println(TuesTime1.getText());
			System.out.println(TuesTime2.getText());
			break;

		case Calendar.WEDNESDAY: //Current day is Wednesday
			System.out.println("WEDNESDAY");
			System.out.println(WedTime1.getText());
			System.out.println(WedTime2.getText());
			break;
			
		case Calendar.THURSDAY: //Current day is Thursday
			System.out.println("THURSDAY");
			System.out.println(ThursTime1.getText());
			System.out.println(ThursTime2.getText());
			System.out.println(ThursTime3.getText());
			break;

		case Calendar.FRIDAY: // Current day is Friday
			System.out.println("FRIDAY");
			System.out.println(FriTime1.getText());
			System.out.println(FriTime2.getText());
			System.out.println(FriTime3.getText());
			break;

		case Calendar.SATURDAY: // Current day is Saturday
			System.out.println("SATURDAY");
			System.out.println(SatTime.getText());
		}
	}
}
