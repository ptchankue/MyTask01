/**
 * 
 */
package com.webmethods.caf.contractrequest;

/**
 * @author PSielinou
 *
 */

import javax.portlet.PortletPreferences;

public class ContractRequest  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf._mytask01 _mytask01 = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public ContractRequest() {
		super(PREFERENCES_NAMES);
	}
	
	/**
	 * Call this method in order to persist
	 * Portlet preferences
	 */
	public void storePreferences() throws Exception {
		updatePreferences();
		PortletPreferences preferences = getPreferences();
		preferences.store();
	}

	public com.webmethods.caf._mytask01 get_mytask01()  {
		if (_mytask01 == null) {
		    _mytask01 = (com.webmethods.caf._mytask01)resolveExpression("#{_mytask01}");
		}
		return _mytask01;
	}
}