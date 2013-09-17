package com.alfrescodev.vaadin.ui;

import com.vaadin.terminal.gwt.client.ui.VEnterBluringDateField;
import com.vaadin.ui.ClientWidget;
import com.vaadin.ui.DateField;

/**
 * 
 * This component extends
 * com.vaadin.ui.DateField and EnterBluringDateField loses 
 * focus every time the user presses enter.
 * 
 * @author Alfrescodev.com
 *
 */
@ClientWidget(VEnterBluringDateField.class)
public class EnterBluringDateField extends DateField {
	
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
