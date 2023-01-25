package webTests.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:resources/config/local.properties",
        "classpath:resources/config/remote.properties"
})
public interface ProjectConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://ibs.ru")
    String baseUrl();
    @Key("secondUrl")
    @DefaultValue("https://ibs-qa.ru/")
    String secondUrl();
    @DefaultValue("chrome")
    String browserName();
    @DefaultValue("108.0")
    String browserVersion();
    @DefaultValue("1920x1080")
    String browserSize();
    String browserMobileView();
    String remoteDriverUrl();
    String videoStorage();
}
