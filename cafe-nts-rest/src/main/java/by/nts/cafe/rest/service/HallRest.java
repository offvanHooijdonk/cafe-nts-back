package by.nts.cafe.rest.service;

import by.nts.cafe.service.model.HallModel;
import by.nts.cafe.service.service.impl.IHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Component
@Path(HallRest.PATH)
@Produces(MediaType.APPLICATION_JSON) // TODO find how make this common for all
public class HallRest {
    static final String PATH = "/hall"; // TODO init from context

    @Autowired
    private IHallService hallService;

    @GET
    public Response list() {
        List<HallModel> list = hallService.getAll();

        return Response.status(Response.Status.OK).entity(list).build();
    }
}
