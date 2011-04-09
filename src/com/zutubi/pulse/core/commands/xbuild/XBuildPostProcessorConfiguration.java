package com.zutubi.pulse.core.commands.xbuild;

import com.zutubi.pulse.core.commands.core.RegexPostProcessorConfiguration;
import com.zutubi.tove.annotations.SymbolicName;

@SymbolicName("XBuildPostProcessor")
public class XBuildPostProcessorConfiguration extends RegexPostProcessorConfiguration
{
    public XBuildPostProcessorConfiguration()
    {
        addErrorRegexes(new String[]{ "^Build FAILED" });
        addErrorRegexes(new String[]{ "^\\w.*:( fatal)? error [A-Z]*[0-9]*:" });
        addWarningRegexes(new String[]{ "^\\w.*: warning [A-Z]*[0-9]*:" });
        setFailOnError(false);
    }

    public XBuildPostProcessorConfiguration(String name)
    {
        this();
        setName(name);
    }
}
