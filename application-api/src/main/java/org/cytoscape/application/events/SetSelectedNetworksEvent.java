package org.cytoscape.application.events;

/*
 * #%L
 * Cytoscape Application API (application-api)
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2008 - 2013 The Cytoscape Consortium
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 2.1 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

import java.util.List;

import org.cytoscape.application.CyApplicationManager;
import org.cytoscape.event.AbstractCyEvent;
import org.cytoscape.model.CyNetwork;

/**
 * An event indicating the a collection of networks has been selected.
 * @CyAPI.Final.Class
 */
public final class SetSelectedNetworksEvent extends AbstractCyEvent<CyApplicationManager> {
	private final List<CyNetwork> networks;

	/**
	 * Constructor.
	 * @param source the application manager firing the event.
	 * @param networks the collection of networks that has been selected.
	 */
	public SetSelectedNetworksEvent(final CyApplicationManager source, final List<CyNetwork> networks) {
		super(source,SetSelectedNetworksListener.class);
		this.networks = networks;
	}

	/** 
	 * Returns the list of networks selected.
	 * @return The list of networks selected.
	 */
	public List<CyNetwork> getNetworks() {
		return networks;
	}
}
