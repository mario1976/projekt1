package WicketApplication;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: hzahn
 * Date: 09.12.12
 * Time: 20:44
 * To change this template use File | Settings | File Templates.
 */
public class FrontPageTest {
    private WicketTester tester = new WicketTester();

    @Before
    public void setUp() throws Exception {
        tester.startPage(FrontPage.class);
    }

    @Test
    public void testFrontPage() throws Exception {
        tester.assertRenderedPage(FrontPage.class);
        tester.assertNoErrorMessage();
    }

    @Test
    public void pageHasWelcomeLabel() throws Exception {
        tester.assertLabel("welcome","Welcome!");
    }

    @Test
    public void pageShouldContainLinkToMinesweeperPage() throws Exception {
        tester.assertComponent("minesweeperLink", BookmarkablePageLink.class);
        // ?? link to minesweeper ??
    }

    @Test
    public void testMinesweeperPageLink() throws Exception {
        tester.clickLink("minesweeperLink");
        tester.assertRenderedPage(MinesweeperPage.class);
    }
}
