package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(name="email")
    public WebElement emailTxtfld;

    @FindBy(name="password")
    public WebElement passwordfld;

    @FindBy(name="Sign in")
    public WebElement signIn;


    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }



}
