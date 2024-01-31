package org.vaadin.chapter2;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("vertical-layout")
public class VerticalLayoutView extends HorizontalLayout {
    public VerticalLayoutView(){
        add(
                new Paragraph("Parrafo 1"),
                new Paragraph("Parrafo 2"),
                new Button("Button")
        );
    }
}
