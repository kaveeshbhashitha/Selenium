package part2.com.sourcedemo.Test.part3.com.demoQa.test.port3.JSPackage;
import org.testng.annotations.Test;
import part2.com.sourcedemo.Test.part3.com.demoQa.base.BaseTest;

public class JsTest extends BaseTest {
    @Test
    public void testScrollingToElement(){
        homePage.goToForms();
    }
}
