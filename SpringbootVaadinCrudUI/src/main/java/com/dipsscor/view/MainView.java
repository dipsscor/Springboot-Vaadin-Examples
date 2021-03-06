package com.dipsscor.view;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.dipsscor.Customer;
import com.dipsscor.CustomerRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout{
	
	private static final Logger log = LoggerFactory.getLogger(MainView.class);
	
	CustomerRepository repository;
	Grid<Customer> grid;
	
	public MainView(CustomerRepository repo) {
		this.repository = repo;
		this.grid = new Grid<>(Customer.class);
		
		TextField filterText = new TextField();
		filterText.setPlaceholder("Filter by last Name");
		filterText.setValueChangeMode(ValueChangeMode.EAGER);
		filterText.addValueChangeListener(e -> listCustomers(e.getValue()));
		
		add(filterText,grid);

	}
	
	private void listCustomers(String filterText) {
		grid.setColumns("id","firstName","lastName");
		
		if (StringUtils.isEmpty(filterText)) {
			grid.setItems(repository.findAll());
		}
		else {
			grid.setItems(repository.findByLastNameStartsWithIgnoreCase(filterText));
		}
		
	}

}
