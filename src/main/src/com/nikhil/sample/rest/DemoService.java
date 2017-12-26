package com.nikhil.sample.rest;

import com.sun.jersey.api.JResponseAsResponse;
import io.swagger.annotations.Api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("demo")
@Produces({ MediaType.APPLICATION_JSON })
@Api
public class DemoService {

    @GET
    public Response getSampleData() {
        Response.ResponseBuilder response = Response.status(Response.Status.OK);
        response.header("Cache-Control", "no-cache, max-age=0");
        return response.entity("Hello World").build();
    }
}
