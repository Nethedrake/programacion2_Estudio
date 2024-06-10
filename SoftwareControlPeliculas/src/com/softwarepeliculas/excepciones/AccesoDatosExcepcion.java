
/*
Esta clase es muy importante porque nos sirve para poder acceder
a los datos y personalizar nuestras excepciones

*/
package com.softwarepeliculas.excepciones;
public class AccesoDatosExcepcion extends Exception {
    public AccesoDatosExcepcion(String mensaje){ //Esto sirve para poder personalizar nuestras porpias excepciones con propios mensajes
    //El super es para extender las clases (Herencia)
    
    //Lo estamos inicializando para pasarle el mensaje    
    super(mensaje);
    }
}
