package org.vaadin.addon.levelindicator.client.vaadin;

import org.vaadin.addon.levelindicator.Levelindicator;
import org.vaadin.addon.levelindicator.client.ui.LevelindicatorWidget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

@Connect(Levelindicator.class)
public class LevelindicatorConnector extends AbstractComponentConnector {

	public LevelindicatorConnector() {
		registerRpc(LevelindicatorClientRpc.class,
				new LevelindicatorClientRpc() {
					@Override
					public void setBarCount(int count) {
						getWidget().setBarCount(count);
					}

					@Override
					public void setFilledBarCount(int count) {
						getWidget().setFilledBars(count);
					}

				});

	}

	@Override
	protected Widget createWidget() {
		return GWT.create(LevelindicatorWidget.class);
	}

	@Override
	public LevelindicatorWidget<?> getWidget() {
		return (LevelindicatorWidget) super.getWidget();
	}

	@Override
	public LevelindicatorState getState() {
		return (LevelindicatorState) super.getState();
	}

	@Override
	public void onStateChanged(StateChangeEvent stateChangeEvent) {
		super.onStateChanged(stateChangeEvent);

		final int d = getState().bars;
		final int e = getState().filledBars;
		getWidget().setBarCount(d);
		getWidget().setFilledBars(e);
	}

}
