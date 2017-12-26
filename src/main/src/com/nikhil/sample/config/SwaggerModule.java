package com.nikhil.sample.config;

import com.google.inject.servlet.ServletModule;

import java.util.HashMap;
import java.util.Map;

public class SwaggerModule extends ServletModule {
    @Override
    protected void configureServlets() {
        super.configureServlets();
        Map<String, String> params = new HashMap<String, String>();
        params.put("com.sun.jersey.config.property.packages", "io.swagger.jaxrs.json;io.swagger.jaxrs.listing;com.nikhil.sample.rest");
        serve("/api/*").with(Bootstrap.class, params);
        //        filter("/api/*").through(Bootstrap.class, params);
        //        bind(Bootstrap.class);

    }
}