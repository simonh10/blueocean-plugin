package io.jenkins.blueocean.rest.model;

import org.kohsuke.stapler.export.Exported;

/**
 * Defines pipeline state and its routing
 *
 * @author Vivek Pandey
 */
public abstract class BluePipeline extends Resource {
    public static final String ORGANIZATION="organization";
    public static final String NAME="name";
    public static final String DISPLAY_NAME="displayName";
    public static final String WEATHER_SCORE ="weatherScore";
    public static final String LATEST_RUN = "latestRun";
    public static final String ESTIMATED_DURATION = "estimatedDurationInMillis";


    /**
     * @return name of the organization
     */
    @Exported(name = ORGANIZATION)
    public abstract String getOrganization();

    /**
     * @return name of the pipeline
     */
    @Exported(name = NAME)
    public abstract String getName();

    /**
     * @return human readable name of this pipeline
     */
    @Exported(name = DISPLAY_NAME)
    public abstract String getDisplayName();

    /**
     * @return weather health score percentile
     */
    @Exported(name = WEATHER_SCORE)
    public abstract int getWeatherScore();

    /**
     * @return The Latest Run for the branch
     */
    @Exported(name = LATEST_RUN, inline = true)
    public abstract BlueRun getLatestRun();


    /**
     * @return Estiamated duration based on last pipeline runs. -1 is returned if there is no estimate available.
     *
     */
    @Exported(name = ESTIMATED_DURATION)
    public abstract Long getEstimatedDurationInMillis();

    /**
     * @return Gives Runs in this pipeline
     */
    public abstract BlueRunContainer getRuns();

}
