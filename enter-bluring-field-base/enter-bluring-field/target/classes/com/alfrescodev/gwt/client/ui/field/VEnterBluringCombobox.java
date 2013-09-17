package com.alfrescodev.gwt.client.ui.field;
import java.util.Iterator;

import com.alfrescodev.gwt.client.ui.Common;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.terminal.gwt.client.ui.VFilterSelect;

/**
 * 
 * This is client GWT component for com.alfrescodev.vaadin.field.EnterBluringCombobox
 * This component extends com.vaadin.terminal.gwt.client.ui.VFilterSelect and 
 * find and focus next field (on page) every time the user presses enter.
 * 
 * @author Alfrescodev.com
 *
 */
public class VEnterBluringCombobox extends VFilterSelect {
	
	private Element getInputElement() {
		Element el=null;
		Widget w=this.getWidget();
		if (w instanceof HasWidgets) {
		    Iterator<Widget> iter = ((HasWidgets) w).iterator();
		    if (iter.hasNext()) {
		    	Widget next=iter.next();
		    	if (next !=null)
		    		el=next.getElement();
		    }
		}
		return el;
	}
	
	private void focusToNext() {
		Common.focusToNext(getInputElement());
	}
	
	private void keyDown(KeyDownEvent event) {
		if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
			focusToNext();								
			super.onKeyDown(event);
        }
		else
			super.onKeyDown(event);
	}
	
	public void onKeyDown(KeyDownEvent event) {
		keyDown(event);
	}

}
