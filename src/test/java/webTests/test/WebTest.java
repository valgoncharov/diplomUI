package webTests.test;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class WebTest extends TestBase {

    @Test
    @Tag("web test")
    @Owner("valGoncharov")
    @Severity(SeverityLevel.NORMAL)
    @Description("Русская версия IBS принятие условий")
    @DisplayName("web IBS accept cookies")
    void ibsOpenWebSiteTest() {
        step("Open base URL company", () ->
            mainPage.openMainPage());

        step("Click on button Accept cookies", () -> {
            mainPage.buttonAcceptCookies();});
    }

    @Test
    @Tag("web test")
    @Owner("valGoncharov")
    @Severity(SeverityLevel.NORMAL)
    @Description("Main page main elements")
    @DisplayName("web IBS main page elements")
    void elementsMainPageTest() {
        step("Open base URL company", () ->
            mainPage.openMainPage());

        step("Check elements on main page - middle level", () -> {
            mainPage.checkButtonLogo()
                    .checkMainProduct()
                    .checkMainSolution();});
    }

    @Test
    @Tag("web test")
    @Owner("valGoncharov")
    @Severity(SeverityLevel.NORMAL)
    @Description("Check elements on footer")
    @DisplayName("web IBS console logs")
    void footerPageTest() {
        step("Open base URL company", () ->
            mainPage.openMainPage());

        step("Check elements on main page - footer level", () -> {
            mainPage.checkFooterOffice()
                    .checkFooterContacts()
                    .checkFooterLegal()
                    .checkFooterCity();});
    }

    @Test
    @Tag("web test")
    @Owner("valGoncharov")
    @Severity(SeverityLevel.NORMAL)
    @Description("Check search on IBS site")
    @DisplayName("web IBS tests search")
    void ibsSearchTest() {
        step("Click on search button", () -> {
           mainPage.checkSearchButton();});

        step("Click on text Импортозамещение", () -> {
           mainPage.getSearchData();});

        step("Check page should have text", () -> {
           mainPage.checkResultSearch();});
    }

    @Test
    @Tag("web test")
    @Description("web test")
    @DisplayName("Check page title should have text")
    void ibsTitleTest() {
        step("Open base URL company", () ->
            mainPage.openMainPage());

        step("Check page Main title text", () -> {
            mainPage.checkTitleText();});
    }
}