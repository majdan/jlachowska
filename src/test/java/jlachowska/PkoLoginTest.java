package jlachowska;

import com.pageobjects.HomePagePko;
import com.pageobjects.LoginPagePko;
import org.junit.AfterClass;
import org.junit.Test;

import static com.setup.SeleniumDriver.getDriver;

public class PkoLoginTest {

	@AfterClass
	public static void tearDown() {
		getDriver().close();
	}
	
	@Test
	public void should_not_login_with_wrong_credentials() {
		//given
		LoginPagePko loginPage = new HomePagePko().open().goToLoginPage();;

		//when
		loginPage.login("mokon", "welcome");
		//then
		//assertThat(loginPage.isLoginError()).isTrue();
	}

}
