package org.vaadin.addon.levelindicator.client.ui;

import java.util.ArrayList;
import java.util.List;

import org.sgx.raphael4gwt.raphael.Paper;
import org.sgx.raphael4gwt.raphael.Raphael;
import org.sgx.raphael4gwt.raphael.Rect;
import org.sgx.raphael4gwt.raphael.base.Attrs;

import com.google.gwt.user.client.ui.Label;

// TODO extend any GWT Widget
public class LevelindicatorWidget<K> extends Label {

	public static final String CLASSNAME = "mycomponent";
	private Paper paper;
	private Rect rect;
	private int width;
	private int height;
	private int barCount;
	private int filledBars;
	private List<Rect> bars;

	public LevelindicatorWidget() {

		setStyleName(CLASSNAME);
		initBars();
	}

	private void initBars() {
		this.width = 40;
		this.height = 24;
		paper = Raphael.paper(this.getElement(), width, height);
		rect = paper.rect(0, 0, width, height);
		rect.attr(Attrs.create().fill("#e6e6e6").stroke(""));

	}

	public void setBarCount(int count) {
		this.barCount = count;
	}

	public void setFilledBars(int count) {
		this.filledBars = count;
		redrawBars();
	}

	private void redrawBars() {
		removeBars();
		drawBars();
	}

	private void drawBars() {
		bars = new ArrayList<Rect>(barCount);
		String fill = "red";
		if (filledBars > barCount * 2 / 3) {
			fill = "green";
		} else if (filledBars > barCount / 3) {
			fill = "yellow";
		}

		double unitWidth = (double) width / (barCount * 5);
		double unitHeight = (double) height / 12;
		for (int i = 0; i < barCount; i++) {
			double x = i * unitWidth * 5 + unitWidth;
			double y = unitHeight + ((barCount - 1) - (double) i)
					/ (barCount - 1) * 4 * unitHeight;
			double w = unitWidth * 3;
			double h = unitHeight * 6 + (double) i / (barCount - 1) * 4
					* unitHeight;
			String barFill = (double) i + 1 > filledBars ? "" : fill;

			Rect bar = paper.rect(x, y, w, h);
			bar.attr(Attrs.create().strokeWidth(unitWidth / 4).fill(barFill)
					.r(unitWidth / 4).stroke("black"));
			bars.add(bar);
		}
	}

	private void removeBars() {
		if (bars != null && !bars.isEmpty()) {
			for (Rect bar : bars) {
				bar.remove();
			}
		}
	}

}