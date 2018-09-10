package Pages.Web;

import Framework.Core.BasePage;
import Framework.DriverFactories.WebDrivers_Local;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.yandex.qatools.properties.annotations.Use;


/**
 * Created by mdrahman on 9/8/18.
 * Spring 2018
 */
public class Homepage extends BasePage {

   private By logInButton = By.id("u_0_2");
   private By userName = By.id("email");
   private By pass = By.id("pass");

   WebDrivers_Local webDrivers_local = new WebDrivers_Local();


    public void enterUsrNm_Pass(String Username, String Password){
        enterText(userName, Username);
        enterText(pass, Password);
    }

    public void clickSubmitButton() throws InterruptedException {
        scrollByPoint();
        sleep(8000);
        clickOn(logInButton);
        moveForward();
    }


}
