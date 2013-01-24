package org.cytoscape.task;

/*
 * #%L
 * Cytoscape Core Task API (core-task-api)
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

import java.util.Collection;

import org.cytoscape.model.CyNetwork;
import org.cytoscape.work.TaskIterator;


/**
 * Produces a task iterator for the specified collection of networks. 
 * @CyAPI.Spi.Interface
 */
public interface NetworkCollectionTaskFactory {
	/** 
	 * Provisions this factory with the collection of networks that will be passed into any task
	 * created by it.
	 * @param networks a non-null collection of {@link CyNetwork}s
	 * @return A TaskIterator object containing one or more {@link org.cytoscape.work.Task} objects to execute.
	 */
	TaskIterator createTaskIterator(Collection<CyNetwork> networks);
	
	/** 
	 * Returns true if this task factory is ready to produce a task iterator.
	 * @param networks a non-null collection of {@link CyNetwork}s
	 * @return true if this task factory is ready to produce a task iterator.
	 */
	boolean isReady(Collection<CyNetwork> networks);
}
