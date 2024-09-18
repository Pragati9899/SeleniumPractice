import driver.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginClass;

public class LoginTest extends BaseLoginTest {
    @Test
    public void getTitleOfPage() {
        System.out.println(DriverManager.getDriver().getTitle());
        Assert.assertEquals(DriverManager.getDriver().getTitle(), "Residual Reports");
    }

    @Test
    public void getCurrentUrlOfPage() {
        System.out.println(DriverManager.getDriver().getCurrentUrl());
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://rr.thedapit.com/login");
    }

    @Test
    public void loginTest() {
        LoginClass login = new LoginClass();
        login.login();
        Assert.assertTrue(login.isDashboardDisplayed());
    }


    //@Test
    public void logiTest() {

    }

    public void loginAgain() {

    }

}
