package com.nikhil.sample.config;

import com.google.inject.servlet.ServletModule;

public class MySampleModule extends ServletModule {
    @Override
    protected void configureServlets() {
        super.configureServlets();
        serve("*.jsp").with(SampleServlet.class);
    }
}
