package WicketApplication;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: hzahn
 * Date: 09.12.12
 * Time: 19:38
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldApplicationTest {
    @Test
    public void applicationHomePageShouldBeStartPage() throws Exception {
        FrontApplication application = new FrontApplication();
        assertEquals(FrontPage.class,application.getHomePage());
    }
}
