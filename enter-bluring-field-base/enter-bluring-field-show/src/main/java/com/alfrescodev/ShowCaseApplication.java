package com.alfrescodev;

import com.alfrescodev.vaadin.ui.EnterBluringCombobox;
import com.alfrescodev.vaadin.ui.EnterBluringDateField;
import com.alfrescodev.vaadin.ui.EnterBluringField;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

/**
 * Demonstration application that shows a simple custom vaadin
 * component, the EnterBluringField. This component extends
 * com.vaadin.ui.AbstractTextField and EnterBluringField loses 
 * focus every time the user presses enter.
 */
@SuppressWarnings("serial")
public class ShowCaseApplication extends com.vaadin.Application {
	
	private static final String FORM1_STYLE_NAME="form1";
	private static final int FORM1_LAYOUT_WIDTH=250;
	private static final int FORM1_LAYOUT_HEIGHT=150;
	
	private static final String DFORM_STYLE_NAME="dform";
	private static final String DFORM_PANEL_STYLE_NAME="dpanel";
	private static final int DFORM_LAYOUT_WIDTH=250;
	private static final int DFORM_LAYOUT_HEIGHT=200;
	
	private static final String ABS_STYLE_NAME="form2";
	private static final int ABS_LAYOUT_WIDTH=250;
	private static final int ABS_LAYOUT_HEIGHT=150;
	
	private static final String FORM2_STYLE_NAME="form1";
	private static final int FORM2_LAYOUT_WIDTH=250;
	private static final int FORM2_LAYOUT_HEIGHT=210;
	
	private static final int FIELD_WIDTH=157;
	
	private static final int MAIN_LAYOUT_HEIGHT = 920;
	
	private static final String COPYRIGHT_TEXT="Created by <a target=\"_blank\" " +
			"href=\"http://www.alfrescodev.com\">www.alfrescodev.com</a>";
	
	private static final String DESCRIPTION_TEXT="This is the sample implementation of vaadin components, " +
			"navigable by enter key. User can move from one component to the next using the enter key" +
			" instead of tab. read more. Every component extends one of vaadin standard components and " +
			"focus next field (on page) every time the user presses enter. <a target=\"_blank\" " +
			"href=\"http://alfrescodev.com/vaadin-enter-instead-tab\">Read more</a>";
	
	Window main = new Window("EnterBluringField Demo");
	
	private void addEnterBluringField(String val, GridLayout addTo) {
		EnterBluringField enterBluringField=new EnterBluringField();
        //enterBluringField.setValue(val);
        addTo.addComponent(enterBluringField);
        addTo.setComponentAlignment(enterBluringField, Alignment.MIDDLE_LEFT);
	}
	
	private GridLayout createForm1Grid() {
		GridLayout form1Grid=new GridLayout(2, 3);		
		form1Grid.setSpacing(true);
		Label label1=new Label("Field1: ");
		form1Grid.addComponent(label1);
		form1Grid.setComponentAlignment(label1, Alignment.MIDDLE_LEFT);
		addEnterBluringField("", form1Grid);
		Label label2=new Label("Field2: ");
		form1Grid.addComponent(label2);
		form1Grid.setComponentAlignment(label2, Alignment.MIDDLE_LEFT);
		addEnterBluringField("", form1Grid);
		Label label3=new Label("Field3: ");
		form1Grid.addComponent(label3);
		form1Grid.setComponentAlignment(label3, Alignment.MIDDLE_LEFT);
		addEnterBluringField("", form1Grid);
		return form1Grid;
	}
	
	private ComboBox createTestComboBox() {
		EnterBluringCombobox cb=new EnterBluringCombobox();
		Long id=1L;
		cb.addItem(id);
		cb.setItemCaption(id, "Value1");
		id=2L;
		cb.addItem(id);
		cb.setItemCaption(id, "Value2");
		return cb;
	}
	
	private GridLayout createForm2Grid() {
		GridLayout form1Grid=new GridLayout(2, 3);
		
		form1Grid.setSpacing(true);
		Label label1=new Label("Select: ");
		form1Grid.addComponent(label1);
		form1Grid.setComponentAlignment(label1, Alignment.MIDDLE_LEFT);
		
		ComboBox cb=createTestComboBox();
		form1Grid.addComponent(cb);
		form1Grid.setComponentAlignment(cb, Alignment.MIDDLE_LEFT);
		
		Label label2=new Label("Date field: ");
		form1Grid.addComponent(label2);
		form1Grid.setComponentAlignment(label2, Alignment.MIDDLE_LEFT);
		
		EnterBluringDateField df=new EnterBluringDateField();
		df.setWidth(FIELD_WIDTH+"px");
		form1Grid.addComponent(df);
		form1Grid.setComponentAlignment(df, Alignment.MIDDLE_LEFT);
		
		Label label3=new Label("Textarea: ");
		form1Grid.addComponent(label3);
		form1Grid.setComponentAlignment(label3, Alignment.MIDDLE_LEFT);

		TextArea ta=new TextArea();
		ta.setWidth(FIELD_WIDTH+"px");
		form1Grid.addComponent(ta);
		form1Grid.setComponentAlignment(df, Alignment.MIDDLE_LEFT);

		return form1Grid;
	}
	
	private VerticalLayout createDescriptionLayout() {
		VerticalLayout descriptionLayout=new VerticalLayout();
		descriptionLayout.addStyleName(DFORM_STYLE_NAME);
		descriptionLayout.setWidth(DFORM_LAYOUT_WIDTH+"px");
		descriptionLayout.setHeight(DFORM_LAYOUT_HEIGHT+"px");
		descriptionLayout.setCaption("ShowCase");
		descriptionLayout.setSpacing(true);	
		Panel panel = new Panel();
		panel.addStyleName(DFORM_PANEL_STYLE_NAME);
		panel.setSizeFull();
		panel.addComponent(
		    new Label(DESCRIPTION_TEXT, Label.CONTENT_XHTML));
		descriptionLayout.addComponent(panel);
		descriptionLayout.setComponentAlignment(panel, Alignment.MIDDLE_CENTER);		
		return descriptionLayout;
	}
	
	private VerticalLayout createForm1Layout() {
		VerticalLayout form1Layout=new VerticalLayout();
		form1Layout.addStyleName(FORM1_STYLE_NAME);
		form1Layout.setWidth(FORM1_LAYOUT_WIDTH+"px");
		form1Layout.setHeight(FORM1_LAYOUT_HEIGHT+"px");
		form1Layout.setCaption("Test Form 1");
		form1Layout.setSpacing(true);	
		GridLayout grid=createForm1Grid();
		form1Layout.addComponent(grid);
		form1Layout.setComponentAlignment(grid, Alignment.MIDDLE_CENTER);
		Button submitButton=new Button("Submit!");
		form1Layout.addComponent(submitButton);
		form1Layout.setComponentAlignment(submitButton, Alignment.TOP_CENTER);
		return form1Layout;
	}
	
	private VerticalLayout createForm2Layout() {
		VerticalLayout form1Layout=new VerticalLayout();
		form1Layout.addStyleName(FORM2_STYLE_NAME);
		form1Layout.setWidth(FORM2_LAYOUT_WIDTH+"px");
		form1Layout.setHeight(FORM2_LAYOUT_HEIGHT+"px");
		form1Layout.setCaption("Test Form 2");
		form1Layout.setSpacing(true);	
		GridLayout grid=createForm2Grid();
		form1Layout.addComponent(grid);
		form1Layout.setComponentAlignment(grid, Alignment.MIDDLE_CENTER);
		Button submitButton=new Button("Submit!");
		form1Layout.addComponent(submitButton);
		form1Layout.setComponentAlignment(submitButton, Alignment.TOP_CENTER);
		return form1Layout;
	}
	
	private VerticalLayout createMainVLayout() {
		VerticalLayout mainVLayout=new VerticalLayout();
		mainVLayout.setHeight(MAIN_LAYOUT_HEIGHT+"px");
		
		VerticalLayout descriptionLayout=createDescriptionLayout();
		mainVLayout.addComponent(descriptionLayout);
		mainVLayout.setComponentAlignment(descriptionLayout, Alignment.MIDDLE_CENTER);
		
		VerticalLayout form1Layout=createForm1Layout();
		mainVLayout.addComponent(form1Layout);
		mainVLayout.setComponentAlignment(form1Layout, Alignment.MIDDLE_CENTER);
		
		AbsoluteLayout absoluteFormL=createAbsoluteFormLayout();
		mainVLayout.addComponent(absoluteFormL);
		mainVLayout.setComponentAlignment(absoluteFormL, Alignment.MIDDLE_CENTER);
		
		VerticalLayout form2Layout=createForm2Layout();
		mainVLayout.addComponent(form2Layout);
		mainVLayout.setComponentAlignment(form2Layout, Alignment.MIDDLE_CENTER);
		
		VerticalLayout copyRightLayout=createCopyRightLayout();
		mainVLayout.addComponent(copyRightLayout);
		mainVLayout.setComponentAlignment(copyRightLayout, Alignment.BOTTOM_CENTER);
        return mainVLayout;
	}
	
	private AbsoluteLayout createAbsoluteFormLayout() {
		AbsoluteLayout absoluteFormL = new AbsoluteLayout();
		absoluteFormL.addStyleName(ABS_STYLE_NAME);
		absoluteFormL.setWidth(ABS_LAYOUT_WIDTH+"px");
		absoluteFormL.setHeight(ABS_LAYOUT_HEIGHT+"px");
		absoluteFormL.setCaption("Absolute layout Form");
		absoluteFormL.addComponent(new Label("Field4: "), "top:13px;left:33px;");
		absoluteFormL.addComponent(new EnterBluringField(), "top:10px;left:83px;");
		
		absoluteFormL.addComponent(new Label("Field5: "), "top:48px;left:33px;");
		absoluteFormL.addComponent(new EnterBluringField(), "top:45px;left:83px;");
		
		absoluteFormL.addComponent(new Label("Field6: "), "top:83px;left:33px;");
		absoluteFormL.addComponent(new EnterBluringField(), "top:80px;left:83px;");
		
		absoluteFormL.addComponent(new Label("Field7: "), "top:118px;left:33px;");
		absoluteFormL.addComponent(new EnterBluringField(), "top:115px;left:83px;");
		return absoluteFormL;
	}
	
	private VerticalLayout createCopyRightLayout() {
		VerticalLayout copyRightLayout=new VerticalLayout();
		copyRightLayout.setSizeUndefined();
		Label copyRightLabel=new Label(COPYRIGHT_TEXT, Label.CONTENT_XHTML);
		copyRightLayout.addComponent(copyRightLabel);
		return copyRightLayout;
	}
	
	private HorizontalLayout createMainLayout() {
		HorizontalLayout mainLayout=new HorizontalLayout();
		mainLayout.setWidth("100%");
		VerticalLayout mainVLayout=createMainVLayout();
		mainLayout.addComponent(mainVLayout);
		mainLayout.setComponentAlignment(mainVLayout, Alignment.MIDDLE_CENTER);								
		
        return mainLayout;
	}

    @Override
    public void init() {
        setMainWindow(main);
        setTheme("show-case-theme");
        HorizontalLayout verticalLayout=createMainLayout();
        main.setContent(verticalLayout);
        main.setSizeFull();
    }
}
