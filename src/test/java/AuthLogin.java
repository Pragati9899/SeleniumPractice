import constants.FrameworkConstants;
import driver.DriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import testUtils.TokenManager;

public class AuthLogin extends BaseTest {
    public static void authLogin() {
        Cookie sessionCookie = new Cookie.Builder("_DASTONE_AUTH_", FrameworkConstants.getCookie())
                .domain("rr.thedapit.com")
                .path("/")
                .build();

        DriverManager.getDriver().manage().addCookie(sessionCookie);

       /* System.out.println(TokenManager.fetchUser());
        System.out.println(TokenManager.fetchAuthToken());*/

        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.localStorage.setItem('user', '" + TokenManager.fetchUser() + "');");
        js.executeScript("window.localStorage.setItem('token', '" + TokenManager.fetchAuthToken() + "');");

        DriverManager.getDriver().navigate().refresh();
        DriverManager.getDriver().get("https://rr.thedapit.com/dashboard");

    }
}