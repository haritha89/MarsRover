package commonfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FunctionLibrary {

    public static WebDriver driver;

    public void setUp()
    {

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\riutr\\Desktop\\drivers\\1\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }


    public void close()
    {
        driver.close();
    }



}
