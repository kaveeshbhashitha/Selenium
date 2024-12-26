package com.demoQa.pages;

import com.demoQa.pages.Forms.FormsPage;
import com.base.BasePage;
import org.openqa.selenium.By;

import static utillities.JsUtility.scrollToElementJs;

public class HomePage extends BasePage {
    private By formCode = By.xpath("//div[@id='app']//h5[text()='Forms']");
    public FormsPage goToForms(){
        scrollToElementJs(formCode);
        click(formCode);
        return new FormsPage();
    }
}
