package com.demoQa.pages.Forms;

import org.openqa.selenium.By;

import static utillities.JsUtility.clickJs;
import static utillities.JsUtility.scrollToElementJs;

public class PracticeFormPage extends FormsPage{
    private By femaleRadioButton = By.id("gender-radio-2");
    public void clickFemaleRadioButton(){
        scrollToElementJs(femaleRadioButton);
        clickJs(femaleRadioButton);
    }
}
