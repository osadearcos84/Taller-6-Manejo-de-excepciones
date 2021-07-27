package com.capacitacion.excepciones.personalizadas;

public class ExcepecionesPersonalizadas extends Exception {

    //public static final String ERROR_CASE4_MESSAGE = "Ruta no encontrada";

    String Causa ="";
    Throwable tipoFalla;

    public void setCausa(String causa) {
       this.Causa = causa;
    }

    public ExcepecionesPersonalizadas (String Causa, Throwable tipoFalla){
        super(Causa,tipoFalla);
    }

}