package com.alfrescodev.vaadin.ui;

import com.alfrescodev.gwt.client.ui.field.VEnterBluringCombobox;
import com.vaadin.ui.ClientWidget;
import com.vaadin.ui.ComboBox;

/**
 * 
 * This component extends
 * com.vaadin.ui.ComboBox and EnterBluringCombobox loses 
 * focus every time the user presses enter.
 * 
 * @author Alfrescodev.com
 *
 */
@ClientWidget(VEnterBluringCombobox.class)
public class EnterBluringCombobox extends ComboBox {

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
