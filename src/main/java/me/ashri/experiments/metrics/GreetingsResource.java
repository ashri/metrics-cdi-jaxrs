package me.ashri.experiments.metrics;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.codahale.metrics.annotation.Timed;

@Path("")
@Produces(MediaType.APPLICATION_JSON)
public class GreetingsResource {

    @GET
    @Timed
    public Response greet() {
        JsonObject json = Json.createObjectBuilder()
                .add("message", "Hello world")
                .build();
        return Response.ok().entity(json).build();
    }

}
