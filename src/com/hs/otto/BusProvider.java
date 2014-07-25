package com.hs.otto;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * The bus event provider, maintains a singleton instance.
 * 
 * @author Vincent
 * @since  Ver. 0.1.0, May. 29, 2014
 */
public final class BusProvider
{
	private static final Bus sBus = new Bus(ThreadEnforcer.ANY);
	
	/** maintain a singleton */
	private BusProvider() {
		
	}
	
	/**
	 * Get the bus instance.
	 * 
	 * @return the bus
	 */
	public static Bus getInstance() {
		return sBus;
	}
}
