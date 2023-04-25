package com.udla;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.oracle.svm.core.annotate.Delete;
import com.udla.Models.Contacto;
import com.udla.Utils.Util;



@Path("/v1/api")
public class ApiController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        return Response.ok(Util.listContacts).build();
    }


@GET
@Produces(MediaType.APPLICATION_JSON)
@Path("{cedula}")
public Response getContacto(@PathParam(value="cedula") String cedula) {
    Contacto contactoObtenido = Util.listContacts.stream()
    .filter(x->x.getCedula().equals(cedula))
    .findAny()
    .orElse(null);

    if (contactoObtenido!=null) {
        return Response.ok(contactoObtenido).build();
    }else{
        return Response.status(Response.Status.BAD_REQUEST).build();
    }
}
                                    
@DELETE
@Produces(MediaType.APPLICATION_JSON)
@Path("{cedula}")
public Response deleteContacto(@PathParam(value="cedula") String cedula) {
    Contacto contactoObtenido = Util.listContacts.stream()
    .filter(x->x.getCedula().equals(cedula))
    .findAny()
    .orElse(null);

    if (contactoObtenido!=null) {
        Util.listContacts.remove(contactoObtenido);
        return Response.status(Response.Status.NO_CONTENT).build();
    }else{
        return Response.status(Response.Status.BAD_REQUEST).build();
    }
}
}
                                                           
                
