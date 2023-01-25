package webTests.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import webTests.config.Property;
import webTests.helpers.AllureAttachments;
import webTests.pages.MainPage;
import webTests.pages.QaPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase extends AllureAttachments {
    MainPage mainPage = new MainPage();
    QaPage qaPage = new QaPage();
    @BeforeAll
    static void beforeAll() {
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe"); у меня тогда не запускаются
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("browserVersion", "100.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        Configuration.browserCapabilities = capabilities;
        Configuration.baseUrl = "https://ibs.ru";
        Configuration.browser = Property.browser();
        Configuration.browserSize = Property.browserSize();
        Configuration.browserVersion = Property.browserVersion();
        Configuration.holdBrowserOpen = true;
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
        if (!Property.remoteUrl().equals("")){
            Configuration.remote = Property.remoteUrl();
        }
    }

    @BeforeEach
    public void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    public void afterEach() {
        screenshotAs("Last screenshot");
        pageSource();
        browserConsoleLogs();
        addVideo();
        closeWebDriver();
    }
}