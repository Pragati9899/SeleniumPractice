import driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseLoginTest {
    @BeforeMethod
    public void setUpMethod() throws IOException {
        Driver.setup();
    }

    @AfterMethod
    public void tearDownMethod(){
        Driver.tearDown();
    }
}
