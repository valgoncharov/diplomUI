package webTests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class MainPage {
    private final static SelenideElement buttonLogo = $(".header-logo"),
                           productMain = $("#bx_1373509569_2413"),
                           mainSolutions = $(".main-solutions"),
                           buttonAccept = $(".cookies-right"),
                           footerOffice = $(".footer-office"),
                           footerContacts = $(".footer-contacts"),
                           footerLegal = $(".footer-legal"),
                           footerCities = $(".footer-cities"),
                           buttonSearch = $(".header-search");

    private final static String ACCEPT_CONDITION = "Принять условия",
                          EXPECTED_TITLE = "IBS — ведущая российская IT-сервисная компания",
                          PRODUCT_MAIN = " Управление программами",
                          MAIN_SOLUTIONS = "Отраслевые",
                          MAIN_OFFICE = "Головной офис",
                          MAIN_PHONE = "Телефон",
                          MAIN_LEGAL = "Персональные данные и правовые аспекты",
                          MAIN_CITY = "Уфа";

    public MainPage openMainPage() {
        open(baseUrl);
        return this;
    }

    public MainPage checkButtonLogo() {
        buttonLogo.should(visible);
        return this;
    }

    public MainPage checkMainProduct() {
        productMain.shouldHave(text(PRODUCT_MAIN));
        return this;
    }

    public MainPage checkMainSolution() {
        mainSolutions.shouldHave(text(MAIN_SOLUTIONS));
        return this;
    }

    public MainPage checkFooterOffice() {
        footerOffice.shouldHave(text(MAIN_OFFICE));
        return this;
    }

    public MainPage checkFooterContacts() {
        footerContacts.shouldHave(text(MAIN_PHONE));
        return this;
    }

    public MainPage checkFooterLegal() {
        footerLegal.shouldHave(text(MAIN_LEGAL));
        return this;
    }

    public MainPage checkFooterCity() {
        footerCities.shouldHave(text((MAIN_CITY)));
        return this;
    }

    public MainPage checkSearchButton() {
        buttonSearch.click();
        return this;
    }

    public MainPage getSearchData() {
        $(byText("Импортозамещение")).click();
        return this;
    }

    public MainPage checkResultSearch() {
        $(".tab").shouldHave(Condition.text("результаты"));
        return this;
    }

    public MainPage buttonAcceptCookies() {
        buttonAccept.$(byText(ACCEPT_CONDITION)).click();
        return this;
    }

    public MainPage checkTitleText() {
        assertThat(title()).isEqualTo(EXPECTED_TITLE);
        return this;
    }
}
