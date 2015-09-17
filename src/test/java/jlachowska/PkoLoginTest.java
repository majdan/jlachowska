package jlachowska;

import static com.setup.SeleniumDriver.getDriver;
import static org.fest.assertions.api.Assertions.assertThat;

import com.pageobjects.HomePagePko;
import com.pageobjects.LoginPagePko;
import org.junit.AfterClass;
import org.junit.Test;

public class PkoLoginTest {

	@AfterClass
	public static void tearDown() {
		getDriver().close();
	}
	
	@Test
	public void should_not_login_with_wrong_credentials() {
		//given
		LoginPagePko loginPage = new HomePagePko().open().goToLoginPage();
		
		//when
		loginPage.login("user", "password");
		//then
		assertThat(loginPage.isLoginError()).isTrue();
	}

}
