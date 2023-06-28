package stepexec;

import commonfunctions.FunctionLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import page.HomePage;

import static org.junit.Assert.assertEquals;


public class SignInStepExec  extends FunctionLibrary {

    HomePage hm=new HomePage(driver);

    public void i_am_on_home_page()  {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.zoopla.co.uk/signin/?page_after_login=%2Findex%2F&return_url=%2Findex%2F&with_confirmation=true");
    }

    public void click_on_sign_in()  {
        // Write code here that turns the phrase above into concrete actions
        hm.emailTxtfld.sendKeys("haritha.mohan1989@gmail.com");
        hm.passwordfld.sendKeys("Harini@123");
        hm.signIn.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void validate_header_text()  {
        // Write code here that turns the phrase above into concrete actions
    }
}
