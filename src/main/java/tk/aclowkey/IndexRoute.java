package tk.aclowkey;

import org.jooby.mvc.GET;
import org.jooby.mvc.Path;

@Path("/v3/index")
public class IndexRoute {
    @GET
    public String getIndex(){
        return "Yes Hello!";
    }
}
