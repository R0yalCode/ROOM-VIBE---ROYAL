#  ROOM VIBE

> **Video de navegación del sistema:**  
> 📺 [Ver demo en YouTube](https://youtu.be/ShmZxyqL-6w)  

---

##  Descripción General

Este proyecto está desarrollado utilizando **Jakarta Faces (JSF)** con Facelets para construir una interfaz gráfica funcional, limpia y conectada a la lógica del sistema mediante *managed beans*. Ha sido creado en un entorno educativo como parte de una entrega evaluada en base a diseño, integración, usabilidad y trabajo en equipo.

---

## Vistas del Sistema
### Vista 1: index.xhtml
<img width="1904" height="999" alt="Image" src="https://github.com/user-attachments/assets/7a470b58-97d3-490b-92ae-10005e75cbfd" />

### Vista 2: login.xhtml
<img width="1919" height="1002" alt="Image" src="https://github.com/user-attachments/assets/5994038a-9543-4387-b0d3-df40a1bd712e" />

### Vista 3: recuperar.xhtml
<img width="1917" height="954" alt="Image" src="https://github.com/user-attachments/assets/fc4c5896-384f-4971-9c46-1066f5eabc6c" />

### Vista 4: habitaciones.xhtml
<img width="1918" height="995" alt="Image" src="https://github.com/user-attachments/assets/92c3c77c-01b0-48f7-b1b2-03ba501401ec" />
<img width="1919" height="864" alt="Image" src="https://github.com/user-attachments/assets/2636aba7-44cd-40f9-abdf-fd12f9f94e2d" />

### Vista 4: reserva.xhtml
<img width="1904" height="980" alt="Image" src="https://github.com/user-attachments/assets/7ff2d13e-da25-42d4-a0fc-2d25e7c19a8d" />

### Vista 5: servicios.xhtml
<img width="1909" height="944" alt="Image" src="https://github.com/user-attachments/assets/e31b2049-ed9a-49f0-a7f7-1ea2e21bbffe" />

### Vista 6: contacto.xhtml
<img width="1903" height="960" alt="image" src="https://github.com/user-attachments/assets/a2c055f9-5ef2-44ad-bd9e-7f3a39f7fcad" />

---

## Estructura del Proyecto
```bash
room-vibe-web/
 ├── Dockerfile
 ├── mvnw
 ├── mvnw.cmd
 ├── pom.xml
 ├── README.md
 └── src/
     └── main/
         ├── java/
         │   └── edu/
         │       └── unl/
         │           └── cc/
         │               └── jbrew/
         │                   ├── bussiness/
         │                   │   ├── SecurityFacade.java
         │                   │   └── services/
         │                   │       ├── PermissionRepository.java
         │                   │       ├── RoleRepository.java
         │                   │       └── UserRepository.java
         │                   ├── controllers/
         │                   │   ├── AuthenticationBean.java
         │                   │   ├── AuthorizationFilter.java
         │                   │   └── security/
         │                   │       ├── UserHome.java
         │                   │       ├── UserList.java
         │                   │       ├── UserPrincipal.java
         │                   │       └── UserSession.java
         │                   ├── domain/
         │                   │   ├── common/
         │                   │   │   ├── GenderType.java
         │                   │   │   └── Person.java
         │                   │   └── security/
         │                   │       ├── ActionType.java
         │                   │       ├── Permission.java
         │                   │       ├── Role.java
         │                   │       └── User.java
         │                   ├── exception/
         │                   │   ├── CredentialInvalidException.java
         │                   │   ├── EncryptorException.java
         │                   │   └── EntityNotFoundException.java
         │                   ├── faces/
         │                   │   ├── ContactoBean.java
         │                   │   ├── FacesUtil.java
         │                   │   ├── InicioBean.java
         │                   │   ├── RecuperarBean.java
         │                   │   ├── ReservaBean.java
         │                   │   └── ValidatorBean.java
         │                   ├── jakarta/
         │                   │   └── hello/
         │                   │       ├── Hello.java
         │                   │       ├── HelloApplication.java
         │                   │       └── HelloWorldResource.java
         │                   └── util/
         │                       └── EncryptorManager.java
         ├── liberty/
         │   └── config/
         │       └── server.xml
         └── webapp/
             ├── contacto.xhtml
             ├── index.xhtml
             ├── login.xhtml
             ├── recuperar.xhtml
             ├── reserva.xhtml
             ├── servicios.xhtml
             ├── test.xhtml
             ├── images/
             │   ├── fondo.jpg
             │   ├── inicio.jpg
             │   ├── inicio1.jpg
             │   ├── reserva.jpg
             │   ├── restaurante.jpg
             │   ├── room-vibe-logo.jpg
             │   ├── spa.jpg
             │   └── servicios/
             │       ├── desayuno.jpg
             │       ├── estacionamiento.jpg
             │       ├── sala.jpg
             │       ├── seguridad.jpg
             │       ├── spa.jpg
             │       └── wifi.jpg
             ├── security/
             │   ├── userEdit.xhtml
             │   └── userList.xhtml
             └── WEB-INF/
                 ├── web.xml
                 └── templates/
                     ├── base.xhtml
                     └── fragments/
                         ├── footer.xhtml
                         └── topbar.xhtml
```

---

  ## Requisitos de Sistema
- Java SE 21
- Apache Maven (versión 3.8.x o superior)
- Docker: para la conexion con la base de datos. 
- Un navegador web moderno 
- IDE como IntelliJ IDEA para desarrollo
> No es necesario instalar Maven si usas el Maven Wrapper (mvnw, mvnw.cmd).
Asegúrate de tener configurada la variable de entorno JAVA_HOME apuntando a tu instalación de Java.

---

##  Instalación del proyecto

```bash
bash
git clone https://github.com/R0yalCode/ROOM-VIBE-FINAL.git
cd ROOM-VIBE-FINAL
mvn clean install
```
---

##  Roles del equipo



- ### [Steeven Pardo](https://github.com/Dan1el17) : Configuración y conexion con la base de datos.
- ### [Royel Jima](https://github.com/R0yalCode) : Configuración en las vistas, cuando el usuario se va a registrar o iniciar secion.  
- ### [Juan Calopino](https://github.com/JuaaanCalopino) : Diseño e implementacion de las vistas para que el cliente pueda elegir las habitaciones y visualizar los servicios.  
- ### [Daniel Saavedra](https://github.com/Dan-San837) : Diseño de la vista principal (index) e implementación de clases complementarias para la misma. 


---

## Autores: 
### [Steeven Pardo](https://github.com/Dan1el17)
### [Royel Jima](https://github.com/R0yalCode)
### [Juan Calopino](https://github.com/JuaaanCalopino)
### [Daniel Saavedra](https://github.com/Dan-San837)


