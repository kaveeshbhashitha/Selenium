package part2.com.sourcedemo.Test.part3.com.demoQa.test.port3.forms;

import org.testng.annotations.Test;
import part2.com.sourcedemo.Test.part3.com.demoQa.base.BaseTest;

public class RadioButtonTest extends BaseTest {
    @Test
    public void testRadioButton(){
        var formPage = homePage.goToForms().clickPracticeForm();
        formPage.clickFemaleRadioButton();
    }
}
