package com.nikhil.sample.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

public class JerseyModule extends JerseyServletModule {
    @Override
    protected void configureServlets() {
        super.configureServlets();
        ResourceConfig rc = new PackagesResourceConfig( "com.nikhil.sample" );
        for ( Class<?> resource : rc.getClasses() ) {
            System.out.println("########### Binding Resource :" + resource.getName());
            bind( resource );
        }
        serve("/rest/*").with(GuiceContainer.class);
        bind(GuiceContainer.class);
        ObjectMapper mapper = new ObjectMapper();
        bind(JacksonJsonProvider.class).toInstance(new JacksonJsonProvider(mapper));
    }
}
