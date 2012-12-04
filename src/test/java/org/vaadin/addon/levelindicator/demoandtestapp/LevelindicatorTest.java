package org.vaadin.addon.levelindicator.demoandtestapp;

import org.vaadin.addon.levelindicator.Levelindicator;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class LevelindicatorTest extends AbstractTest {

	@Override
	Component getTestComponent() {
		VerticalLayout layout = new VerticalLayout();

		final Levelindicator c = new Levelindicator(9, 3);
		c.setWidth(600, Unit.PIXELS);
		c.setHeight(300, Unit.PIXELS);
		layout.addComponent(c);

		Button b = new Button("+1");
		layout.addComponent(b);
		b.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				int bars = c.getFilledBars();
				if (bars >= 9) {
					c.setFilledBars(0);
				} else {
					c.setFilledBars(bars + 1);
				}
			}
		});
		final Levelindicator cc = new Levelindicator(3, 1);
		layout.addComponent(cc);
		return layout;
	}
}