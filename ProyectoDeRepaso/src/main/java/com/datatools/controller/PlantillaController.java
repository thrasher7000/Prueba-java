package com.datatools.controller;

import com.datatools.model.Usuario;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class PlantillaController implements Serializable{
    
    public void verificarSession(){
        try {
            
           FacesContext contex = FacesContext.getCurrentInstance();
           Usuario us = (Usuario) contex.getExternalContext().getSessionMap().get("usuario");
           
            if (us == null) {
                contex.getExternalContext().redirect("./../permisos.xhtml");
            }
        } 
        catch (Exception e) {
            // se podria almacenar un log para ver algún error
        }
    }
}
