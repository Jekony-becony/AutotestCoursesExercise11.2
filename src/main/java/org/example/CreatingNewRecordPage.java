package org.example;

import org.omg.CORBA.WCharSeqHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;


public class CreatingNewRecordPage {
    private WebDriver driver;
    @FindBy(xpath = "/html/body/div[2]/nav/div/div[2]/ul[1]/li[2]/a/span[2]")
    private WebElement createRecord;
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[2]/form/div[3]/div[1]/input\"")
    private WebElement tittle;
    @FindBy(id = "postTitle")
    private WebElement postTittle;
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[2]/form/div[5]/a/input[1]")
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
    public CreatingNewRecordPage clickTittle(){
        assertTrue(tittle.isEnabled());
        tittle.click();
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
