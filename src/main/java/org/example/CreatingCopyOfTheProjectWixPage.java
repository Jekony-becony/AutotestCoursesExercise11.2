package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreatingCopyOfTheProjectWixPage {
    private WebDriver driver;
    @FindBy(xpath = "//span[@class='s2OqYb sOSHl9 o3e0Ed---ellipsisLines-10-singleLine']")
    private WebElement manage;
    @FindBy(xpath = "//span[@class='s3uMWx o2q-Az---size-5-small o2q-Az---skin-8-standard o2q-Az---weight-4-thin o2q-Az---list-style-9-checkmark sOSHl9 o3e0Ed---ellipsisLines-10-singleLine s3MdNl']")
    private WebElement createCopy;
    @FindBy(xpath = "//span[@class='buttonnext1986848257__content']")
    private WebElement createCopyNext;
    @FindBy(xpath = "//span[@class='sFwQyN']")
    private WebElement look;
    public CreatingCopyOfTheProjectWixPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public CreatingCopyOfTheProjectWixPage clickCreateCopy(){
        assertTrue(createCopy.isEnabled());
        createCopy.click();
        return this;
    }
    public CreatingCopyOfTheProjectWixPage clickCreateCopyNext(){
        assertTrue(createCopyNext.isEnabled());
        createCopyNext.click();
        return this;
    }
    public CreatingCopyOfTheProjectWixPage clickManage(){
        assertTrue(manage.isEnabled());
        manage.click();
        return this;
    }
    public CreatingCopyOfTheProjectWixPage clickLook(){
        assertTrue(look.isEnabled());
        look.click();
        return this;
    }

}
