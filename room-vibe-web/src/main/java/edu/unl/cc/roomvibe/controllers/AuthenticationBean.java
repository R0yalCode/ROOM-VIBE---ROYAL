// src/main/java/edu/unl/cc/roomvibe/controllers/AuthenticationBean.java
package edu.unl.cc.roomvibe.controllers;

import edu.unl.cc.roomvibe.bussiness.SecurityFacade;
import edu.unl.cc.roomvibe.controllers.security.UserPrincipal;
import edu.unl.cc.roomvibe.controllers.security.UserSession;
import edu.unl.cc.roomvibe.domain.security.User;
import edu.unl.cc.roomvibe.faces.FacesUtil;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.servlet.ServletException;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.util.logging.Logger;

@Named
@ViewScoped
public class AuthenticationBean implements Serializable {

    private static final Logger logger = Logger.getLogger(AuthenticationBean.class.getName());

    @NotNull
    private String username;

    @NotNull
    @Size(min = 8, message = "Contraseña muy corta")
    private String password;

    @Inject
    private SecurityFacade securityFacade;

    @Inject
    private UserSession userSession;

    public String login() {
        logger.info("Intentando login con username: " + username);
        try {
            User user = securityFacade.authenticate(username, password);
            setHttpSession(user);

            FacesUtil.addMessageAndKeep(FacesMessage.SEVERITY_INFO, "Aviso", "Bienvenido " + user.getName() + " a la aplicación Jbrew.");
            userSession.postLogin(user);
            return "index.xhtml?faces-redirect=true";
        } catch (Exception e) {
            FacesUtil.addMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), null);
            return null;
        }
    }

    public String logout() throws ServletException {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().invalidateSession();
        FacesUtil.addSuccessMessageAndKeep("Sesión cerrada correctamente");
        ((jakarta.servlet.http.HttpServletRequest) facesContext.getExternalContext().getRequest()).logout();
        return "/login.xhtml?faces-redirect=true";
    }

    public boolean isUserSessionActive() {
        FacesContext context = FacesContext.getCurrentInstance();
        return context.getExternalContext().getSessionMap().containsKey("user");
    }

    /**
     * Establece la sesión de usuario en el contexto.
     */
    private void setHttpSession(User user) {
        FacesContext context = FacesContext.getCurrentInstance();
        UserPrincipal userPrincipal = new UserPrincipal(user);
        context.getExternalContext().getSessionMap().put("user", userPrincipal);
    }

    // Getters y setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}