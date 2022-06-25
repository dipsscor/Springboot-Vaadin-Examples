package com.dipsscor.view;


import com.dipsscor.Customer;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "listview")
@PageTitle("Customer | Vaadin CRM")
public class ListView extends VerticalLayout { 
    Grid<Customer> grid = new Grid<>(Customer.class); 
    TextField filterText = new TextField();

    public ListView() {
        addClassName("list-view");
        setSizeFull();
        configureGrid(); 

        add(getToolbar(), grid); 
    }

    private void configureGrid() {
        grid.addClassNames("contact-grid");
        grid.setSizeFull();
        grid.setColumns("firstName", "lastName"); 
        grid.getColumns().forEach(col -> col.setAutoWidth(true)); 
    }

    private HorizontalLayout getToolbar() {
        filterText.setPlaceholder("Filter by name...");
        filterText.setClearButtonVisible(true);
        filterText.setValueChangeMode(ValueChangeMode.LAZY); 

        Button addContactButton = new Button("Add Customer");

        HorizontalLayout toolbar = new HorizontalLayout(filterText, addContactButton); 
        toolbar.addClassName("toolbar");
        return toolbar;
    }
}