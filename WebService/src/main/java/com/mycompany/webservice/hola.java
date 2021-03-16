/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservice;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Xav
 */
@Path("generic")
public class hola {
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of hola
     * @param nombre
     */
    public hola() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.webservice.hola
     * @param nombre
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml(@QueryParam("nombre") String nombre) {
        //TODO return proper representation object
        return "<h1>"+nombre+"</h1>";
        //throw new UnsupportedOperationException();
    }
    
    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String message){
        String output="Hola que tal "+message+"!";
        return Response.status(200).entity(output).build();
    }
    /**
     * PUT method for updating or creating an instance of hola
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
}
