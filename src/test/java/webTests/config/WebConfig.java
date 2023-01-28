package webTests.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:resources/config/local.properties",
        "classpath:resources/config/remote.properties"
})
public interface WebConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://ibs.ru")
    String baseUrl();
    @Key("secondUrl")
    @DefaultValue("https://ibs-qa.ru/")
    String secondUrl();
    @DefaultValue("chrome")
    String browser();
    @DefaultValue("108.0")
    String browserVersion();
    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();
    @Key("remote")
    String remote();
    String selenoidLogin();
    String selenoidPassword();
    @DefaultValue("intl.accept_languages=ru")
    String chromeOptions();
}
