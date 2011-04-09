package com.zutubi.pulse.core.commands.xbuild;

import com.zutubi.pulse.core.commands.core.ExamplesBuilder;
import com.zutubi.tove.config.api.ConfigurationExample;

public class XBuildCommandConfigurationExamples
{
    public ConfigurationExample getSimple()
    {
        XBuildCommandConfiguration command = new XBuildCommandConfiguration();
        command.setName("build");
        command.setTargets("build");
        return ExamplesBuilder.buildProject(command);
    }

    public ConfigurationExample getCustomised()
    {
        XBuildCommandConfiguration command = new XBuildCommandConfiguration();
        command.setName("test");
        command.setBuildFile("myproject.proj");
        command.setTargets("build test");
        command.setConfiguration("Debug");
        command.addBuildProperty(new BuildPropertyConfiguration("foo", "bar"));
        return ExamplesBuilder.buildProject(command);
    }
}
