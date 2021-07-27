package com.capacitacion.excepciones;

import com.capacitacion.excepciones.personalizadas.ExcepecionesPersonalizadas;
import com.capacitacion.excepciones.procesos.ProcesarDatos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.io.FileNotFoundException;
import java.text.ParseException;

@SpringBootApplication
public class ExcepcionesApplication {

    public static void main(String[] args) throws ExcepecionesPersonalizadas {

        SpringApplication.run(ExcepcionesApplication.class, args);

        //caso1();
        //caso2();
        //caso3();
       // caso4();
        caso5();

    }

    public static void caso1() {

        // cree una instancia de la clase ProcesarDatos y use el metodo division.
        //envie   los valores ("48", "0") - division por cero
        //en el metodo division capture e identifique la excepcion que se genera (no la excepcion general de java Exception) e imprima en consola  desde  el catch StackTrace,Cause,Message;
        // haga lo mismo para los valores ("15.8", "30")

        ProcesarDatos caso1 = new ProcesarDatos();

        caso1.division("48","0");
        caso1.division("15.8","30");

    }

    public static void caso2() {

		//cree una instancia de la clase ProcesarDatos y use el metodo division. y use metodo arreglo
		//envie al metodo arry de string  de 3 valores para que se genere una excepcion.
		//capture e identifique la excepcion que se genera (no la excepcion general de java Exception) e imprima en consola   StackTrace,Cause,Message del error;

		String array[] = new String[3];
        array[0] = "Oscar";
        array[1] = "Lia";
        array[2] = "Janeth";

        ProcesarDatos caso2 = new ProcesarDatos();

        caso2.arreglo(array);

    }

    public static void caso3() {

        //// cree una instancia de la clase ProcesarDatos y use el metodo fecha.
        //envie al metodo una fecha con el formato "yyyy/mm/dd".
        //capture e identifique la excepcion que se genera (no la excepcion general de java Exception)
        // Re-lance la excepcion y capturela aqui en el metodo case3 e imprima en consola StackTrace,Cause,Message del error;

		ProcesarDatos caso3 = new ProcesarDatos();

        caso3.fecha("2021/07/14");

    }

    public static void caso4() throws ExcepecionesPersonalizadas {
        //manejo de excepciones personalizadas

        ProcesarDatos caso4 = new ProcesarDatos();


        caso4.leerarchivo("src\\main\\java\\com\\capacitacion\\excepciones\\datos\\data.tx");


    }

    public static void caso5() throws ExcepecionesPersonalizadas {
        //manejo de cierre de  objetos en lectura y escritura de arhivos

        ProcesarDatos caso5 = new ProcesarDatos();

        caso5.leerarchivo("src\\main\\java\\com\\capacitacion\\excepciones\\datos\\data.txt");

    }

}