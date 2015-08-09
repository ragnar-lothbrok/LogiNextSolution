package com.loginext.test.services;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value = "/coordinateServices", description = "REST Services for fetching Coordniates")
@WebService(serviceName = "customerServices")
@Produces({ MediaType.APPLICATION_JSON })
public interface CoordinateService {

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/coordinate/{id}")
    @ApiOperation(value = "Get Coordinate", response = Object.class)
    public Object getCoordinate(@PathParam("id") Integer id);

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/coordinates")
    @ApiOperation(value = "Get Coordinates", response = Object.class)
    public Object getAllCoordinates();

}
