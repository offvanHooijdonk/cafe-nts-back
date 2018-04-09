package by.nts.cafe.rest.service;

import by.nts.cafe.rest.HallBean;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Component
@Path(HallService.PATH)
@Produces(MediaType.APPLICATION_JSON) // TODO find how make this common for all
public class HallService {
    static final String PATH = "/hall";

    @GET
    public Response list() {
        List<HallBean> list = new ArrayList<>();

        list.add(new HallBean("1", "Hall Test 1"));
        list.add(new HallBean("3", "Hall #2"));
        list.add(new HallBean("6", "Pink Hall"));
        list.add(new HallBean("32", "Hookah Hall"));
        list.add(new HallBean("63", "Super Hall"));

        return Response.status(Response.Status.OK).entity(list).build();
    }
}
