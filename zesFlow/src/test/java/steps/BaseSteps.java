package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import settings.Driver;

public class BaseSteps {

    @Before
    public void abreBrowser(){
        Driver.openBrowser();
    }

    @After
    public void fechaBrowser(){
        Driver.quitProcess();
    }

}
