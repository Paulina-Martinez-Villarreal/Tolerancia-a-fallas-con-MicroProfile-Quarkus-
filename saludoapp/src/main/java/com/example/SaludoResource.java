package com.example.saludoapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/saludo")
public class SaludoResource {
    
    @ConfigProperty(name = "saludo.mensaje", defaultValue = "¡Hola, mundo!")
    String mensaje;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getSaludo() {
        return mensaje;
    }
}
