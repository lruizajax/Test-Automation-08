package com.store.utils;

import com.store.pages.HomePage;
import com.store.pages.LoginPage;
import com.store.pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Locale;

public class BaseTest {

    public WebDriver driver;
    protected int TIME_OUT = 10;
    protected String URL = "https://demowebshop.tricentis.com";

    protected HomePage homePage;
    protected RegisterPage registerPage;
    protected LoginPage loginPage;
    protected DBValidation dbValidation;

    @BeforeMethod
    public void setup()  {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless=new");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT));
        driver.get(URL);

        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        dbValidation = new DBValidation();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }
}
