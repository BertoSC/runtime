package org.example;

import java.io.IOException;

public class RuntimeEx1 {
    public static void main(String[] args) throws IOException {

        //APARTADO 1

        //public int availableProcessors()
        //para devolver el número de procesadores disponibles en la maquina virtual de Java
        //creamos objeto Runtime
        Runtime runtime = Runtime.getRuntime();
        //invocamos el método específico y guardamos el valor en una variable
        int procDisp = runtime.availableProcessors();
        //mostramos el resultado por pantalla
        System.out.println(procDisp);

        //APARTADO 2
        String [] comando = {"C:/Program Files/Google/Chrome/Application/chrome"};
        Process process = runtime.exec(comando);

        //APARTADO 3
        String [] comando2 = {"C:/Program Files/Google/Chrome/Application/chrome", "https://www.youtube.com/"};
        Process process2 = runtime.exec(comando2);

        //APARTADO 4
        String [] comando3={"C:/Windows/notepad"};
        Process process3 = runtime.exec(comando3);









    }
}
