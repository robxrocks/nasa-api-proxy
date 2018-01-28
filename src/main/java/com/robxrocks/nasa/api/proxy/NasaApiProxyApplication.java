package com.robxrocks.nasa.api.proxy;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class NasaApiProxyApplication extends Application<NasaApiProxyConfiguration> {

    public static void main(final String[] args) throws Exception {
        new NasaApiProxyApplication().run(args);
    }

    @Override
    public String getName() {
        return "NasaApiProxy";
    }

    @Override
    public void initialize(final Bootstrap<NasaApiProxyConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final NasaApiProxyConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
