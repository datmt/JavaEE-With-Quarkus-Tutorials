package com.datmt;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/get-started")
public class QuarkusStart {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hey quarkus starter again";
    }

    @GET
    @Path("file")
    @Produces(MediaType.APPLICATION_XML)
    public Response download() {
        return Response.ok("directly to browser")
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=great_file.xml")
                .build();
    }

}