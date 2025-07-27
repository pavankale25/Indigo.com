package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
  WebDriver driver;
	public Home_page(WebDriver driver) {
		this.driver = driver;
	PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[text()='Round Trip']")
	WebElement RoundTrip;


public void RoundTripRadio() {
	RoundTrip.click();
}
}