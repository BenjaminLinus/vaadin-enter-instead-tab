package com.alfrescodev.vaadin.ui;

import com.alfrescodev.gwt.client.ui.field.VEnterBluringTextField;
import com.vaadin.ui.AbstractTextField;
import com.vaadin.ui.ClientWidget;

/**
 * 
 * This component extends
 * com.vaadin.ui.AbstractTextField and EnterBluringField loses 
 * focus every time the user presses enter.
 * 
 * @author Alfrescodev.com
 *
 */
@ClientWidget(VEnterBluringTextField.class)
public class EnterBluringField extends AbstractTextField {
	
	public EnterBluringField() {
		setValue("");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /** The property value of the field is a String. */
    @Override
    public Class<?> getType() {
        return super.getType();
    }

}
