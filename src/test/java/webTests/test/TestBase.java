package webTests.test;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import webTests.drivers.WebDriver;
import webTests.pages.MainPage;
import webTests.pages.QaPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static webTests.helpers.AllureAttachments.*;

public class TestBase {
    MainPage mainPage = new MainPage();
    QaPage qaPage = new QaPage();

    @BeforeAll
    static void beforeAll() {
        WebDriver.configure();
    }

    @BeforeEach
    public void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void afterEach() {
        screenshotAs("Last screenshot");
        pageSource();
        browserConsoleLogs();
        addVideo();
        closeWebDriver();
    }
}