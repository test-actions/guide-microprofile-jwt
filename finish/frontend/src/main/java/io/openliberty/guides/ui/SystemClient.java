package io.openliberty.guides.ui;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Typed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.HeaderParam;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8080/system")
@Path("/properties")
@ApplicationScoped
public interface SystemClient extends AutoCloseable{
 
    @GET
    @Path("/os")
    @Produces(MediaType.APPLICATION_JSON)
    public String getOS(@HeaderParam("Authorization") String authorization);
    
    @GET
    @Path("/username")
    @Produces(MediaType.APPLICATION_JSON)
    public String getUsername(@HeaderParam("Authorization") String authorization);

    @GET
    @Path("/jwtname")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJwtName(@HeaderParam("Authorization") String authorization);

    @GET
    @Path("/jwtroles")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJwtRoles(@HeaderParam("Authorization") String authorization);

}