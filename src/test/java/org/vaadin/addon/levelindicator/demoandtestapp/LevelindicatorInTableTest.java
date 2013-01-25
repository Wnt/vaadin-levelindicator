package org.vaadin.addon.levelindicator.demoandtestapp;

import org.vaadin.addon.levelindicator.Levelindicator;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class LevelindicatorInTableTest extends AbstractTest {

	@Override
	Component getTestComponent() {
		VerticalLayout layout = new VerticalLayout();

		Button b = new Button("+1");
		layout.addComponent(b);

		Table table = new Table("Test table");
		layout.addComponent(table);

		table.addContainerProperty("Column 1", String.class, null);
		table.addContainerProperty("Lavelindicator", Levelindicator.class, null);

		final Levelindicator c = new Levelindicator(6, 2);
		c.setWidth(80, Unit.PIXELS);
		c.setHeight(80, Unit.PIXELS);

		table.addItem(new Object[] { "test", c }, new Integer(1));

		b.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				int bars = c.getFilledBars();
				if (bars >= 6) {
					c.setFilledBars(0);
				} else {
					c.setFilledBars(bars + 1);
				}
			}
		});

		return layout;
	}

	@Override
	public String getDescription() {
		return "Levelindicator inside a table. When a component is in a table the client-side initialization happens in a different order.";
	}
}