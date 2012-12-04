package org.vaadin.addon.levelindicator;

import org.vaadin.addon.levelindicator.client.vaadin.LevelindicatorState;

import com.vaadin.annotations.JavaScript;
import com.vaadin.ui.AbstractComponent;

/**
 * Server side component for the MyComponent widget.
 */
@JavaScript({ "public/raphael-min.js", "public/raphael4gwt-all-min.js" })
public class Levelindicator extends AbstractComponent {
	private final int bars;
	private int filledBars;

	public Levelindicator(int bars, int filledBars) {
		this.bars = bars;
		this.filledBars = filledBars;
		setWidth(40, Unit.PIXELS);
		setHeight(24, Unit.PIXELS);
	}

	@Override
	public LevelindicatorState getState() {
		LevelindicatorState state = (LevelindicatorState) super.getState();
		state.bars = bars;
		state.filledBars = filledBars;
		return state;
	}

	public int getFilledBars() {
		return filledBars;
	}

	public void setFilledBars(int filledBars) {
		this.filledBars = filledBars;
		markAsDirty();
	}
}