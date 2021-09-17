package org.example;// Generated by Selenium IDE

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CreatinganewrecordTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @AfterEach
    public void tearDown() {
        LogEntries browserLogs = driver.manage().logs().get(LogType.BROWSER);
        List<LogEntry> allLogRows = browserLogs.getAll();
        if (allLogRows.size() > 0 ) {
            for(LogEntry info : allLogRows){

                System.out.println(info);
            }
        }
        driver.quit();
    }

    @Test
    public void creatinganewrecord() {
        driver.get("https://diary.ru/");
        AutorizationPage autorizationPage = new AutorizationPage(driver);
        driver.manage().window().setSize(new Dimension(1536, 864));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        autorizationPage.clickEnter();
        autorizationPage.clickLoginformUsername();
        autorizationPage.setLoginformUsername("sasha911a");
        autorizationPage.clickLoginformPassword();
        autorizationPage.setLoginformPassword("Co#gMpVcui");
        driver.switchTo().frame(0);
        autorizationPage.clickRecaptcha();
        driver.switchTo().defaultContent();
        autorizationPage.clickLogin();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        CreatingNewRecordPage creatingNewRecordPage = new CreatingNewRecordPage(driver);
        creatingNewRecordPage.clickCreateRecord();
        creatingNewRecordPage.clickPostTittle().addPostTittle("Новая запись");
        driver.switchTo().frame(1);
        driver.findElement(By.cssSelector("html")).click();
        {
            WebElement element = driver.findElement(By.id("tinymce"));
            js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'Новая запись в мой дневник'}", element);
        }
        driver.switchTo().defaultContent();
        creatingNewRecordPage.clickRewrite();
        System.out.println("Test ended sucessfully!");
    }
}
