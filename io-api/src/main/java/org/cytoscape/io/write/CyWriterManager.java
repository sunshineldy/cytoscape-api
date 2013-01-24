package org.cytoscape.io.write;

/*
 * #%L
 * Cytoscape IO API (io-api)
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2006 - 2013 The Cytoscape Consortium
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
import java.io.OutputStream;

import org.cytoscape.io.CyFileFilter;

/**
 * A CyWriterManager aggregates {@link CyWriterFactory} services for specific DataCategories
 * and provides a mechanism for choosing the {@link CyWriterFactory} given a particular
 * file type.
 * @CyAPI.Api.Interface
 */
public interface CyWriterManager<W extends CyWriterFactory> {

	/**
	 * Returns a list of the available {@link CyFileFilter}s that define the available
	 * output types.
	 * @return A list of the available {@link CyFileFilter}s that define the available
	 * output types.
	 */
	List<CyFileFilter> getAvailableWriterFilters();


	/**
	 * Returns a {@link CyWriterFactory} for the appropriate filter.
	 * @param filter The filter used to determine the type of file written.
	 * generated by the {@link CyWriterFactory}.
	 * @return A {@link CyWriterFactory} for the appropriate filter.
	 */
	W getMatchingFactory(CyFileFilter filter); 
}
