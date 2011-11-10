package org.cytoscape.view.presentation.property;

import org.cytoscape.model.CyTableEntry;
import org.cytoscape.view.model.VisualLexicon;
import org.cytoscape.view.model.VisualLexiconNode;
import org.cytoscape.view.model.VisualProperty;

/**
 * Utility functions for traversing visual lexicon tree.
 * @CyAPI.Static.Class #ASKMIKE declare final, private construct?
 */
public class VisualPropertyUtil {

	/**
	 * Check whether the given {@linkplain VisualProperty} is a child of parent vp or not.
	 * 
	 * @param parent parent visual property
	 * @param vp visual property to be tested
	 * @param lexicon lexicon tree
	 * 
	 * @return true if it's a child of the parent or parent itself.  Otherwise, return false.
	 *  
	 */
	public static boolean isChildOf(final VisualProperty<?> parent, final VisualProperty<?> vp,
			final VisualLexicon lexicon) {
		
		if(vp == null)
			throw new NullPointerException("Visual Property is null.");
		
		if(lexicon == null)
			throw new NullPointerException("Lexicon is null.");
		
		if(lexicon.getAllVisualProperties().contains(vp) == false)
			throw new IllegalArgumentException("No such Visual Porperty in the lexicon: " + vp.getDisplayName());
		
		
		VisualLexiconNode node = lexicon.getVisualLexiconNode(vp);
		
		// This is a root
		if(node.getParent() == null)
			return false;

		if (vp == parent || node.getParent().getVisualProperty() == parent)
			return true;

		
		while (node.getParent() != null) {
			node = node.getParent();
			if (node.getVisualProperty() == parent)
				return true;
		}

		return false;
	}
}
