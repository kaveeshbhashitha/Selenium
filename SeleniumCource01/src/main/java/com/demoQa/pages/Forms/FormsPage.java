package com.demoQa.pages.Forms;
import com.demoQa.pages.HomePage;
import org.openqa.selenium.By;

import static utillities.JsUtility.scrollToElementJs;

public class FormsPage extends HomePage {
    private By practiceFormItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");
    public PracticeFormPage clickPracticeForm(){
        scrollToElementJs(practiceFormItem);
        click(practiceFormItem);
        return new PracticeFormPage();
    }
}
