package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;


public class AutorizationPageWix {
    private WebDriver driver;
    @FindBy(xpath = "/html/body/login-dialog/div/login/div/form/div[3]/div[1]/div[3]/div/button")
    private WebElement enter;
    @FindBy(xpath = "/html/body/login-dialog/div/login/div/form/div[3]/div[1]/desktop-input-new[1]/md-input-container/input")
    private WebElement loginformUsername;
    @FindBy(xpath = "/html/body/login-dialog/div/login/div/form/div[3]/div[1]/desktop-input-new[2]/md-input-container/input")
    private WebElement loginformPassword;
    @FindBy(xpath = "//*[@id=\"recaptcha-anchor\"]")
    private WebElement recaptcha;
    @FindBy(id = "login_btn")
    private WebElement login;
    public AutorizationPageWix(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public AutorizationPageWix clickRecaptcha() {
        assertTrue(recaptcha.isEnabled());
        recaptcha.click();
        return this;
    }
    public AutorizationPageWix clickLogin() {
        assertTrue(login.isEnabled());
        login.click();
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
