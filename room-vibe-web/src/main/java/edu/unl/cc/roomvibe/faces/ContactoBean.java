package edu.unl.cc.roomvibe.faces;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

/**
 * author:
 * Steeven Pardo
 * Juan Calopino
 * Royel Jima
 * Daniel Savedra
 */

@Named
@ViewScoped
public class ContactoBean implements Serializable {

    private String sugerencia;

    public void validarSugerencia() {
        if (sugerencia == null || sugerencia.trim().isEmpty()) {
            FacesUtil.addErrorMessage("La sugerencia no puede estar vacía");
        } else {
            FacesUtil.addSuccessMessage("Gracias por tu sugerencia: " + sugerencia);
        }
    }

    /**
     * Nos ayuda a enviar un mesanje pero actualmente solo muestra un mensaje, ya que no esta conectado
     * a una BD, eso se planteara despues
     */
    public void enviar() {
        if (sugerencia == null || sugerencia.trim().isEmpty()) {
            FacesUtil.addErrorMessage("No se puede enviar una sugerencia vacía");
        } else {
            FacesUtil.addSuccessMessageAndKeep("Sugerencia enviada correctamente: " + sugerencia);
            sugerencia = null;
        }
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }


}
