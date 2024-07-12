import driver.Driver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

public class BaseTest {

    @BeforeClass
    public void setUpMethod() throws IOException {
     Driver.setup();
    }

    @AfterClass
    public void tearDownMethod(){
        Driver.tearDown();
    }
}
