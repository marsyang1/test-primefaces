package com.clarity;

import org.omnifaces.util.Faces;

import javax.faces.component.UIComponent;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class FontSelectionListener implements ActionListener {

    @Override
    public void processAction(ActionEvent event)
            throws AbortProcessingException {
//    FacesContext c = FacesContext.getCurrentInstance();
//    ELResolver elResolver = c.getApplication().getELResolver();
//    FontSettings fs = (FontSettings)
//      elResolver.getValue(c.getELContext(), null, "fontSettings");
        FontSettings fs = Faces.evaluateExpressionGet("fontSettings");
        if (((UIComponent) event.getSource()).getClientId().startsWith("minus"))
            fs.decrement();
        else
            fs.increment();
    }
}