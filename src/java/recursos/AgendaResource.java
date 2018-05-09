/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import clases.Agenda;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import metodos.ImportarExportar;

/**
 * REST Web Service
 *
 * @author y9d1ru
 */
@Path("agenda")
public class AgendaResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AgendaResource
     */
    public AgendaResource() {
    }

    /**
     * Retrieves representation of an instance of recursos.AgendaResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Agenda getXml() {
        ImportarExportar ie = new ImportarExportar("agenda.xml");
        return ie.cargar();
    }

    /**
     * PUT method for updating or creating an instance of AgendaResource
     * @param content representation for the resource
     */
}
