import commonfunctions.FunctionLibrary;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestFrameWork {
    FunctionLibrary fl=new FunctionLibrary();
    @Before
    public void openBrowser()
    {
       fl.setUp();
    }

    @After
    public void closeBrowser()
    {
        fl.close();
    }
}
