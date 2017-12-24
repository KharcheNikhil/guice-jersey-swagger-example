package com.nikhil.sample;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.nikhil.sample.config.JerseyModule;
import com.nikhil.sample.config.MySampleModule;

public class SampleAppConfig extends GuiceServletContextListener {
    protected Injector getInjector() {
        System.out.println("Binding Modules");
        return Guice.createInjector(new MySampleModule(), new JerseyModule());
    }
}
