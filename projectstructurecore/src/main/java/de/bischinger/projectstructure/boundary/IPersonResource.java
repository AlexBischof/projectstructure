package de.bischinger.projectstructure.boundary;

import de.bischinger.projectstructure.entity.Person;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

/**
 * Created by bischofa on 04.10.17.
 */
@Path("/person")
public interface IPersonResource {
    @GET
    List<Person> getPersons();

    @POST
    @Path("{id}/celebrate")
    void celebrateBirthday(@PathParam("id") long id);
}
