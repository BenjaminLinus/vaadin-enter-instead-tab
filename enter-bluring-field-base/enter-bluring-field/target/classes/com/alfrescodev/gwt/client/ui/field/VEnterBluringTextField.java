package com.alfrescodev.gwt.client.ui.field;

import com.alfrescodev.gwt.client.ui.Common;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.vaadin.terminal.gwt.client.ui.VTextField;

/**
 * 
 * This is client GWT component for com.alfrescodev.vaadin.field.EnterBluringField
 * This component extends com.vaadin.terminal.gwt.client.ui.VTextField and 
 * find and focus next field (on page) every time the user presses enter.
 * 
 * @author Alfrescodev.com
 *
 */
public class VEnterBluringTextField extends VTextField {
	
	private void keyDown(KeyDownEvent event) {
		if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
			Common.focusToNext(this.getElement());
        }
	}
	
	public VEnterBluringTextField() {
		addKeyDownHandler(new KeyDownHandler() {
		    public void onKeyDown(KeyDownEvent event) {
		    	keyDown(event);			
			}

		});
	}

}
