package org.vaadin.addon.levelindicator.client.vaadin;

import com.vaadin.shared.communication.ClientRpc;

public interface LevelindicatorClientRpc extends ClientRpc {

	public void setBarCount(int count);

	public void setFilledBarCount(int count);

}