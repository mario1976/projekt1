package WicketApplication;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Created with IntelliJ IDEA.
 * User: hzahn
 * Date: 09.12.12
 * Time: 18:58
 * To change this template use File | Settings | File Templates.
 */
public class StartJetty {
    public static void main(String[] args) throws Exception {
        Server server = new Server();
        Connector connector = new SelectChannelConnector();
        connector.setPort(8080);
        connector.setHost("127.0.0.1");
        server.addConnector(connector);

        WebAppContext wac = new WebAppContext();
        wac.setContextPath("/");
        wac.setWar(".");
//		wac.setParentLoaderPriority(false);
        server.setHandler(wac);
        server.setStopAtShutdown(true);

        server.start();
    }
}
