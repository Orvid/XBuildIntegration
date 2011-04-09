package com.zutubi.pulse.core.commands.xbuild;

import com.zutubi.pulse.core.commands.core.ExamplesBuilder;
import com.zutubi.tove.config.api.ConfigurationExample;

public class XBuildPostProcessorConfigurationExamples
{
    private static final String NAME = "xbuild.pp";

    public ConfigurationExample getTrivial()
    {
        return new ConfigurationExample(NAME, createEmpty());
    }

    public ConfigurationExample getApply()
    {
        return ExamplesBuilder.buildProjectForCommandOutputProcessor(createEmpty());
    }

    private XBuildPostProcessorConfiguration createEmpty()
    {
        XBuildPostProcessorConfiguration pp = new XBuildPostProcessorConfiguration(NAME);
        pp.getPatterns().clear();
        return pp;
    }
}
