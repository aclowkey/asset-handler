package tk.aclowkey;

import org.jooby.Jooby;
import org.jooby.handlers.AssetHandler;

/**
 * @author jooby generator
 */
public class App extends Jooby {
    App() {
        // Commenting out the next line breaks the route
        // assets("**", new AssetHandler("/")).name("Assets");
        use(IndexRoute.class);
        port(9000);
    }

    public static void main(final String[] args) {

        run(App::new, args);
    }

}
