package com.sourcedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class ProductPage extends BasePage {
    private By productHeader = By.xpath("//span[text()='Products']");
    public boolean isProductHeaderDisplay(){
        return find(productHeader).isDisplayed();
    }
}
