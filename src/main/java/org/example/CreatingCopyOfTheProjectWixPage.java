package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class CreatingCopyOfTheProjectWixPage {
    private WebDriver driver;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/div[1]/div[1]/div/span/div/div[1]/div/div[3]/span/div/div/button/span")
    private WebElement buttonnext;
    @FindBy(xpath = "/html/body/div[26]/div/div/span/div/div/div/div/div[4]/button/div/span")
    private WebElement nthChild;
    @FindBy(xpath = "/html/body/div[31]/div/div/span/div/div/div[3]/div/div/button[2]")
    private WebElement createCopy;
    public CreatingCopyOfTheProjectWixPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public CreatingCopyOfTheProjectWixPage clickNthChild(){
        assertTrue(nthChild.isEnabled());
        nthChild.click();
        return this;
    }
    public CreatingCopyOfTheProjectWixPage clickButtonNext(){
        assertTrue(buttonnext.isEnabled());
        buttonnext.click();
        return this;
    }
    public CreatingCopyOfTheProjectWixPage clickCreateCopy(){
        assertTrue(createCopy.isEnabled());
        createCopy.click();
        return this;
    }
    public CreatingCopyOfTheProjectWixPage performCreateCopy(){
        assertTrue(createCopy.isEnabled());
        Actions builder = new Actions(driver);
        builder.moveToElement(createCopy).perform();
        return this;
    }
    public CreatingCopyOfTheProjectWixPage clickAndHoldCreateCopy(){
        assertTrue(createCopy.isEnabled());
        Actions builder = new Actions(driver);
        builder.moveToElement(createCopy).clickAndHold();
        return this;
    }
    public CreatingCopyOfTheProjectWixPage releaseCreateCopy(){
        assertTrue(createCopy.isEnabled());
        Actions builder = new Actions(driver);
        builder.moveToElement(createCopy).release();
        return this;
    }
}
