package part2.com.sourcedemo.Test.Login;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.sourcedemo.base.BaseTest;

public class LoginTest extends BaseTest {
    @Test
    public void testLoginErrorMessage(){
        loginPage.setUsername("standard_user");
        //loginPage.setPassword("secret_sauce");
        loginPage.setPassword("xyz3400");
        //var productPage =  loginPage.clickLoginButton();
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        //System.out.println(actualMessage);
        //Assert.assertTrue(actualMessage.contains("Epic sadface"));
        Assert.assertFalse(actualMessage.contains("Epic sadface"));
    }
}
