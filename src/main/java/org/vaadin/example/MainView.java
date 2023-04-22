package org.vaadin.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;

@PermitAll
@Route
public class MainView extends VerticalLayout {

    public MainView() {
        add(new Button("Say hello", e -> add(new Paragraph("new JSESSIONID"))));
    }
}
