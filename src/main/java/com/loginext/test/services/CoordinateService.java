package com.loginext.test.services;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@WebService(serviceName = "customerServices")
@Produces({ MediaType.APPLICATION_JSON })
public interface CoordinateService {

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/coordinate/{id}")
    public Object getCoordinate(@PathParam("id") Integer id);

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/coordinates")
    public Object getAllCoordinates();

}
