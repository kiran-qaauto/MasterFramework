package com.kiran.config;

import com.kiran.config.converters.StringToBrowserTypeConverter;
import com.kiran.enums.BrowserRemoteModeType;
import com.kiran.enums.BrowserType;
import com.kiran.enums.RunModeBrowserType;
import org.aeonbits.owner.Config;

@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("runModeBrowser")
    RunModeBrowserType browserRunMode();

    @Key("browserRemoteMode")
    BrowserRemoteModeType browserRemoteMode();
}
