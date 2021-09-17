package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CreatingNewRecordPage {
    private WebDriver driver;
    @FindBy(xpath = "//a[@title='Новая запись']")
    private WebElement createRecord;
    @FindBy(id = "postTitle")
    private WebElement postTittle;
    @FindBy(id = "rewrite")
    private WebElement rewrite;
    public CreatingNewRecordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public CreatingNewRecordPage clickCreateRecord(){
        assertTrue(createRecord.isEnabled());
        createRecord.click();
        return this;
    }
    public CreatingNewRecordPage clickRewrite(){
        assertTrue(rewrite.isEnabled());
        rewrite.click();
        return this;
    }
    public CreatingNewRecordPage clickPostTittle(){
        assertTrue(postTittle.isEnabled());
        postTittle.click();
        return this;
    }
    public CreatingNewRecordPage addPostTittle(CharSequence keys){
        assertTrue(postTittle.isEnabled());
        postTittle.sendKeys(keys);
        return this;
    }

}
