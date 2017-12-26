package com.nikhil.sample.config;/*
package com.nikhil.sample.config;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;
import com.wordnik.swagger.jaxrs.config.BeanConfig;
import org.glassfish.jersey.servlet.ServletContainer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Singleton
public class Bootstrap extends ServletContainer {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.2");
        beanConfig.setBasePath("api");
        beanConfig.setResourcePackage("io.swagger.resources");
        beanConfig.setScan(true);
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Here To serve But no use");
        super.service(request, response);
    }
}
*/

import com.google.inject.Singleton;
import com.sun.jersey.spi.container.servlet.ServletContainer;
import com.sun.jersey.spi.container.servlet.WebConfig;
import io.swagger.jaxrs.config.BeanConfig;

import javax.servlet.ServletException;

@Singleton
public class Bootstrap extends ServletContainer {
    @Override
    protected void init(WebConfig config) throws ServletException {
        super.init(config);

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8085");
        beanConfig.setBasePath("/api");
        beanConfig.setResourcePackage("com.nikhil.sample.rest");
        beanConfig.setScan(true);
    }
}