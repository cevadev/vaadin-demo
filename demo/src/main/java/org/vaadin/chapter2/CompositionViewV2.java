package org.vaadin.chapter2;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("compositionv2")
public class CompositionViewV2 extends Composite<VerticalLayout> {
    public CompositionViewV2(){
        var toolBar = new HorizontalLayout(
                new Button("Button 1"),
                new Button("Button 2"),
                new Button("Button 3")
        );
        var mainLayout = getContent(); // retorna un VerticalLayout
        mainLayout.add(toolBar,
                new Paragraph("Parrafo 1"),
                new Paragraph("Parrafo 2"),
                new Paragraph("Parrafo 3"));
    }
}
