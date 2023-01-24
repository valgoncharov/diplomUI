package webTests.test;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class WebTest extends TestBase {
    @Test
    @Tag("web test")
    @Owner("valGoncharov")
    @Severity(SeverityLevel.NORMAL)
    @Description("Русская версия IBS принятие условий")
    @DisplayName("web IBS tests")
    void ibsOpenWebSiteTest() {
        step("Open base URL company", () ->
                open(baseUrl));

        step("Click on button Accept cookies", () -> {
            $(".cookies-right").$(byText("Принять условия")).click();
        });
    }
        @Test
        @Tag("web test")
        @Owner("valGoncharov")
        @Severity(SeverityLevel.NORMAL)
        @Description("Check specified content on IBS eng site")
        @DisplayName("web IBS tests eng")
        void ibsChooseLanguageTest() {
        step("Click on ENG button", () -> {
            $(".header-burger js-burger").click();
        });

        step("Click on Technology Partners", () -> {
            $(".card__title").$(byText("Technology Partners")).click();
        });

        step("Click on see more", () -> {
            $(".card__more").click();
        });

        step("Check page should have modal ROBIN Partner", () -> {
            $(".partners-item__title").shouldHave(Condition.text("Primo RPA"));
        });
    }

    @Test
    @Description("web test")
    @DisplayName("Check page title should have text")
    void ibsTitleTest() {
        step("Open base URL company", () ->
                open(baseUrl));

        step("Check page title should have text 'IBS — ведущая российская IT-сервисная компания'", () -> {
            String expectedTitle = "IBS — ведущая российская IT-сервисная компания";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
}