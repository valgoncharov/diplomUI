package webTests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class QaPage {
    private final static SelenideElement buttonQaAccept = $(".cookies-right"),
                           buttonQaGray = $(".welcome-button"),
                           promoToggles = $(".promo-toggles__left col-6"),
                           toggleTitle = $(".toggle-title"),
                            aboutPage = $("a[href*='https://ibs-qa.ru/about/']");

    private final static String PROMO_TEXT = "Преимущества работы",
                                ACCEPT_CONDITION = "Принять условия",
                                TOGGLE_TITLE = "Консалтинг";

    public QaPage openQaPage() {
        open("https://ibs-qa.ru/");
        return this;
    }

    public QaPage acceptCookiesPage() {
        buttonQaAccept.$(byText(ACCEPT_CONDITION)).click();
        return this;
    }

    public QaPage shouldBeButtonOnPage() {
        buttonQaGray.shouldBe(Condition.visible);
        return this;
    }

    public QaPage clickOnButtonOnPage() {
        aboutPage.click();
        return this;
    }

    public QaPage checkPromoOnPage() {
        promoToggles.shouldBe(Condition.text(PROMO_TEXT));
        return this;
    }

    public QaPage checkPromoTitlePage() {
        toggleTitle.shouldHave(Condition.text(TOGGLE_TITLE));
        return this;
    }

}
