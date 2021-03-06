package com.dipsscor.view;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextFieldVariant;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("textboxview")
@PageTitle("dipsscor | TexBox")
public class TextBoxExample extends VerticalLayout{
	
	public TextBoxExample() {
		Label label = new Label("\nThis is Text Box View");
		TextField text1 = new TextField();
		text1.setPlaceholder("Simple Text Box");
		
		String description="Simple Mandatory Text Box";
		TextField text2 = new TextField();
		text2.setPlaceholder(description);
		text2.setRequired(true);
		text2.setRequiredIndicatorVisible(true);
		text2.setWidth("250px");
		
		
		

		TextField text3 = new TextField();
		text3.setValue("Text Box with clear button");
		text3.setWidth(""+new String("Text Box with clear button").length());
		text3.setClearButtonVisible(true);
		
		
		TextField text4 = new TextField();
		text4.setValue("value");
		text4.addThemeVariants(TextFieldVariant.LUMO_ALIGN_RIGHT);
		
		
		add(label,text1,text2,text3,text4);
	}

}
