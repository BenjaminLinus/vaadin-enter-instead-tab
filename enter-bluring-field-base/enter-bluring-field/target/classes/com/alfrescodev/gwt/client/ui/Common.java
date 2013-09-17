package com.alfrescodev.gwt.client.ui;

import static com.google.gwt.query.client.GQuery.$;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.GQuery;
import com.google.gwt.user.client.ui.UIObject;

public class Common {
	
	public static void focusToNext(Element currentElement) {
		GQuery allInputs=$("input, textarea, select");
		boolean intersected=false;		
		for (int i = 0; i < allInputs.length(); ++i) {
			Element newEl=allInputs.get(i);
			boolean isVisible = UIObject.isVisible(newEl) && (newEl.getOffsetHeight() != 0) && (newEl.getOffsetWidth() != 0);
			if (isVisible) {
				if (intersected) {
					newEl.focus();
					break;
				}
				if (newEl==currentElement) {
					intersected=true;
				}		   
			}
		}
	}

}
