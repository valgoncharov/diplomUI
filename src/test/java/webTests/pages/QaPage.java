package webTests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static webTests.data.TestData.ACCEPT_CONDITION;
import static webTests.data.TestData.secondUrl;

public class QaPage {
    public SelenideElement buttonQaAccept = $(".cookies-right"),
                           buttonQaGray = $(".button button--gray"),
                           promoToggles = $(".promo-toggles__left col-6"),
                           toggleTitle = $(".toggle-title");

    private final static String PROMO_TEXT = "Преимущества работы",
                                TOGGLE_TITLE = "Консалтинг";

    public QaPage openQaPage() {
        open(secondUrl);
        return this;
    }

    public QaPage acceptCookiesPage() {
        buttonQaAccept.$(byText(ACCEPT_CONDITION)).click();
        return this;
    }

    public QaPage shouldBeButtonOnPage() {
        buttonQaGray.shouldBe(Condition.exist);
        return this;
    }

    public QaPage clickOnButtonOnPage() {
        buttonQaGray.shouldBe(Condition.exist);
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
