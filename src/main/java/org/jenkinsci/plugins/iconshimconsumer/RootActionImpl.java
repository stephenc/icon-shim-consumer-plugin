package org.jenkinsci.plugins.iconshimconsumer;

import hudson.Extension;
import hudson.model.RootAction;

/**
 * @author Stephen Connolly
 */
@Extension
public class RootActionImpl implements RootAction {
    public String getIconFileName() {
        return "images/24x24/plugin.png";
    }

    public String getDisplayName() {
        return "Shim usage";
    }

    public String getUrlName() {
        return "shim-test";
    }
}
