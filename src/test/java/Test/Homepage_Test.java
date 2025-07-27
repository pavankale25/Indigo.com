package Test;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.Home_page;

public class Homepage_Test extends BaseTest {
	
	@Test
	public void flightBookingFlow() {
		Home_page hp = new Home_page(driver);
		hp.RoundTripRadio();
	}

}
