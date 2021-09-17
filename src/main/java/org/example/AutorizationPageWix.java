package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AutorizationPageWix {
    private WebDriver driver;
    @FindBy(name= "submit")
    private WebElement enter;
    @FindBy(name = "email")
    private WebElement loginformUsername;
    @FindBy(name = "password")
    private WebElement loginformPassword;
    @FindBy(id = "recaptcha-anchor-label")
    private WebElement recaptcha;
    public AutorizationPageWix(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public AutorizationPageWix clickRecaptcha() {
        assertTrue(recaptcha.isEnabled());
        recaptcha.click();
        return this;
    }
    public AutorizationPageWix clickLoginformUsername() {
        assertTrue(loginformUsername.isEnabled());
        loginformUsername.click();
        return this;
    }
    public AutorizationPageWix clickLoginformPassword() {
        assertTrue(loginformPassword.isEnabled());
        loginformPassword.click();
        return this;
    }
    public AutorizationPageWix clickEnter() {
        assertTrue(enter.isEnabled());
        enter.click();
        return this;
    }
    public AutorizationPageWix setLoginformUsername(CharSequence keys) {
        loginformUsername.sendKeys(keys);
        return this;
    }
    public AutorizationPageWix setLoginformPassword(CharSequence keys) {
        loginformPassword.sendKeys(keys);
        return this;
    }
    public AutorizationPageWix performEnter() {
        Actions builder = new Actions(driver);
        builder.moveToElement(enter).perform();
        return this;
    }
    public AutorizationPageWix clickAndHoldEnter() {
        Actions builder = new Actions(driver);
        builder.moveToElement(enter).clickAndHold();
        return this;
    }
    public AutorizationPageWix releaseEnter() {
        Actions builder = new Actions(driver);
        builder.moveToElement(enter).release();
        return this;
    }
}
