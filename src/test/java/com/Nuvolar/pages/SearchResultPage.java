package com.Nuvolar.pages;

import com.Nuvolar.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultPage extends BasePage {

    public WebElement itemSelectorByNumber(int number){
        WebElement item=Driver.getDriver().findElement(By.xpath("(//div[@data-index='"+number+"'])[1]"));
        return item;
    }
}
