package part2.com.sourcedemo.Test.Products;

import com.sourcedemo.pages.ProductPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import part2.com.sourcedemo.base.BaseTest;

public class ProductTest extends BaseTest {
    @Test
    public void testProductHeaderIsDisplayed(){
        ProductPage productPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        //loginPage.setUsername("standard_user");
        //loginPage.setPassword("secret_sauce");
        //loginPage.setPassword("xyz3400");
        //String expectedText = "Product";
        assertTrue(productPage.isProductHeaderDisplay(), "\n \n Product header is not display");
        //assertFalse(productPage.isProductHeaderDisplay(), "\n \n Product header is not display");
    }
}
