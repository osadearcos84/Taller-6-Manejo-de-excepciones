package com.capacitacion.excepciones.procesos;

import com.capacitacion.excepciones.personalizadas.ExcepecionesPersonalizadas;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProcesarDatos {


    public int division(String numero1, String numero2) {
        int resultado = 0;

        try {
            resultado = Integer.valueOf(numero1) / Integer.valueOf(numero2);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por Cero  " + e.getCause() + e.getMessage());
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Las variables declaradas solo reciben valores enteros  " + e.getCause() + e.getMessage());
            e.printStackTrace();
        }
        return resultado;

    }

    public void arreglo(String[] lista) {

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(lista[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El arreglo enviado solo es de 3 posiciones  " + e.getCause() + e.getMessage());
            e.printStackTrace();
        }

    }

    public void fecha(String input) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = format.parse(input);
            date.toString();
        } catch (ParseException e) {
            System.out.println("El formato de la fecha enviada es incorrecto, debe ser en formato yyyy-MM-dd. " + e.getCause() + e.getMessage());
            e.printStackTrace();
        }

    }

    public void leerarchivo(String path) throws ExcepecionesPersonalizadas {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        List<String> persons = new ArrayList<String>();

        try {

            archivo = new File(path);
            fr = new FileReader(archivo);


            br = new BufferedReader(fr);


            String linea;
            while ((linea = br.readLine()) != null)
                persons.add(linea);
            System.out.println(linea);

        } catch (Exception e) {

            throw new ExcepecionesPersonalizadas("Rura no encontrada", e);


        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        try {
            String path2 = "src\\main\\java\\com\\capacitacion\\excepciones\\datos\\data2.txt";
            String content = "";
            File file = new File(path2);


            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < persons.size(); i++) {

                String[] persona = persons.get(i).split(";");
                if (i == 4) {
                    content = persona[0] + ";" + persona[1];
                } else {
                    content = persona[0] + ";" + persona[2];
                }
                bw.write(content + "\n");
            }


            bw.close();

        } catch (Exception e) {

            throw new ExcepecionesPersonalizadas("el array list no tiene el indice X", e);

        }


    }

}
