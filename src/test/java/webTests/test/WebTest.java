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
    @DisplayName("web IBS accept cookies")
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
        @Description("Check search on IBS site")
        @DisplayName("web IBS tests search")
        void ibsSearchTest() {
        step("Click on search button", () -> {
            $(".header-search").click();
        });

        step("Click on text Импортозамещение", () -> {
            $(byText("Импортозамещение")).click();
        });

        step("Check page should have text", () -> {
            $(".tab").shouldHave(Condition.text("результаты"));
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