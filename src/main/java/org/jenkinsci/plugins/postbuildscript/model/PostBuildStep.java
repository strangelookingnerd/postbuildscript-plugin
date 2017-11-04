package org.jenkinsci.plugins.postbuildscript.model;

import hudson.tasks.BuildStep;
import org.kohsuke.stapler.DataBoundConstructor;

import java.util.Collection;
import java.util.List;


public class PostBuildStep extends PostBuildItem {

    private final List<BuildStep> buildSteps;

    @DataBoundConstructor
    public PostBuildStep(List<BuildStep> buildSteps, Collection<String> results) {
        super(results);
        this.buildSteps = buildSteps;
    }

    public List<BuildStep> getBuildSteps() {
        return buildSteps;
    }


}
