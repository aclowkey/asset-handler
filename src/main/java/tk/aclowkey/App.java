package tk.aclowkey;

import org.jooby.Jooby;
import org.jooby.handlers.AssetHandler;

/**
 * @author jooby generator
 */
public class App extends Jooby {
    App() {
        //assets("**", new AssetHandler("/")).name("Asserts");
        use(IndexRoute.class);
        port(9000);
    }

    public static void main(final String[] args) {

        run(App::new, args);
    }

}
