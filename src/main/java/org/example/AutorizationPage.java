package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class AutorizationPage {
    private WebDriver driver;
    @FindBy(xpath = "//span[@class='i-lock']")
    private WebElement enter;
    @FindBy(id = "loginform-username")
    private WebElement loginformUsername;
    @FindBy(id = "loginform-password")
    private WebElement loginformPassword;
    @FindBy(id = "recaptcha-anchor-label")
    private WebElement recaptcha;
    @FindBy(id = "login_btn")
    private WebElement login;
    public AutorizationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public AutorizationPage clickRecaptcha() {
        assertTrue(recaptcha.isEnabled());
        recaptcha.click();
        return this;
    }
    public AutorizationPage clickLogin() {
        assertTrue(login.isEnabled());
        login.click();
        return this;
    }
    public AutorizationPage clickLoginformUsername() {
        assertTrue(loginformUsername.isEnabled());
        loginformUsername.click();
        return this;
    }
    public AutorizationPage clickLoginformPassword() {
        assertTrue(loginformPassword.isEnabled());
        loginformPassword.click();
        return this;
    }
    public AutorizationPage clickEnter() {
        assertTrue(enter.isEnabled());
        enter.click();
        return this;
    }
    public AutorizationPage setLoginformUsername(CharSequence keys) {
        loginformUsername.sendKeys(keys);
        return this;
    }
    public AutorizationPage setLoginformPassword(CharSequence keys) {
        loginformPassword.sendKeys(keys);
        return this;
    }
}
