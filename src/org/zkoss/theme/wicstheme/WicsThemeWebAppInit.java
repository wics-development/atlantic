package org.zkoss.theme.wicstheme;

import org.zkoss.zk.ui.WebApp;
import org.zkoss.zk.ui.WebApps;
import org.zkoss.zk.ui.util.WebAppInit;
import org.zkoss.zkmax.theme.ResponsiveThemeRegistry;
import org.zkoss.zul.theme.Themes;

public class WicsThemeWebAppInit implements WebAppInit {

	private final static String wicstheme_NAME = "wicstheme";
	private final static String wicstheme_DISPLAY = "wicstheme";
	private final static int wicstheme_PRIORITY = 1000;

	public void init(WebApp wapp) throws Exception {
		Themes.register(wicstheme_NAME, wicstheme_DISPLAY, wicstheme_PRIORITY);
		String edition = WebApps.getEdition();
		if ("EE".equals(edition)) {
			Themes.register(ResponsiveThemeRegistry.TABLET_PREFIX + wicstheme_NAME, wicstheme_DISPLAY, wicstheme_PRIORITY);
		}
	}

}
