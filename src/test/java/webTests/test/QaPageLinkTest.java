package webTests.test;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;

public class QaPageLinkTest extends TestBase{
    @Test
    @Tag("web test")
    @Owner("valGoncharov")
    @Severity(SeverityLevel.NORMAL)
    @Description("Русская версия IBS принятие условий")
    @DisplayName("web IBS-QA accept cookies")
    void acceptCookiesOnQaPageTest() {
        step("Open QA URL company", () ->
             qaPage.openQaPage());

        step("Click on button Accept cookies", () -> {
            qaPage.acceptCookiesPage();});
    }

    @Test
    @Tag("web test")
    @Owner("valGoncharov")
    @Severity(SeverityLevel.NORMAL)
    @Description("Русская версия IBS принятие условий")
    @DisplayName("Check button on the page")
    void goToAboutPageTest() {
        step("Open QA URL company", () ->
             qaPage.openQaPage());

        step("Click on button Accept cookies", () -> {
            qaPage.acceptCookiesPage();});

        step("Check button on page", () -> {
            qaPage.shouldBeButtonOnPage();});

        step("Click on button", () -> {
            qaPage.clickOnButtonOnPage();});
    }

    @Test
    @Tag("web test")
    @Owner("valGoncharov")
    @Severity(SeverityLevel.NORMAL)
    @Description("Русская версия IBS принятие условий")
    @DisplayName("Check button on the page")
    void searchArticleOnQaPage() {
        step("Open QA URL company", () ->
                qaPage.openQaPage());

        step("Check promo on page", () -> {
            qaPage.checkPromoOnPage()
                  .checkPromoTitlePage();});
    }
}
