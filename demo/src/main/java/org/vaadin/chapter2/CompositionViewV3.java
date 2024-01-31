package org.vaadin.chapter2;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("compositionv3")
public class CompositionViewV3 extends Composite<Component> {
    protected Component initContent(){
        var toolBar = new HorizontalLayout(
                new Button("Button 1"),
                new Button("Button 2"),
                new Button("Button 3")
        );
        return new VerticalLayout(toolBar,
                new Paragraph("Parrafo 1"),
                new Paragraph("Parrafo 2"),
                new Paragraph("Parrafo 3"));
    }
}
