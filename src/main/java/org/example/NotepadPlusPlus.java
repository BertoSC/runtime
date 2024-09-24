package org.example;

import java.io.IOException;

public class NotepadPlusPlus {
    public static void main(String[] args) throws IOException {

       // captar entorno ejecución teniendo en cuenta que es un singleton
        //, es decir,  una única instancia del entorno de ejecución

        Runtime runtime = Runtime.getRuntime(); //
        String [] command = {"C:/Program Files/Notepad++/notepad++.exe"}; // ruta del ejecutable
        Process process = runtime.exec(command); //ejecutamos


    }
}