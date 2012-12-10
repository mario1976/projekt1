package WicketApplication;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class FrontApplication extends WebApplication {

    @Override
    public Class<? extends Page> getHomePage() {
        return FrontPage.class;
    }
}
