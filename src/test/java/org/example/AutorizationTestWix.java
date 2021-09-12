package org.example;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import java.sql.Time;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AutorizationTestWix {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void main() {
        driver.get("https://users.wix.com/signin?view=sign-up&sendEmail=true&postSignUp=https:%2F%2Fuk.wix.com%2Fnew%2Fintro&loginCompName=Signup_H&referralInfo=Signup_H&postLogin=https:%2F%2Fuk.wix.com%2Fmy-account%2Fsites&forceRender=true");
        driver.manage().window().setSize(new Dimension(1920, 1080));
        AutorizationPageWix autorizationPageWix = new AutorizationPageWix(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        autorizationPageWix.clickLoginformUsername();
        autorizationPageWix.setLoginformUsername("sasha.ivanenko10@mail.ru");
        autorizationPageWix.clickLoginformPassword();
        autorizationPageWix.setLoginformPassword("1234567890");
        autorizationPageWix.clickAndHoldEnter().performEnter();
        autorizationPageWix.performEnter();
        autorizationPageWix.releaseEnter().performEnter();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        autorizationPageWix.clickEnter();
        driver.close();
        System.out.println("Test ended sucessfully!");
    }
}