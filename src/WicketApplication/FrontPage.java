package WicketApplication;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.Link;

public class FrontPage extends WebPage {
	/**
	 * Constructor
	 */
	public FrontPage() {
		add(new Label("welcome", "Welcome!"));
        add(new BookmarkablePageLink<MinesweeperPage>("minesweeperLink",MinesweeperPage.class));
	}
}