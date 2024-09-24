package org.example;

import java.io.IOException;
import java.util.Scanner;

public class CmdDate {
    public static void main(String[] args) throws IOException, InterruptedException {

       // captar entorno ejecución teniendo en cuenta que es un singleton
        //, es decir,  una única instancia del entorno de ejecución

        Runtime runtime = Runtime.getRuntime();

        // ruta del ejecutable, si queremos ejecutar comando hay que decir que llamamos a cmd
        // /C sirve para decirle a cmd que ejecute date /T y cierre

        String [] command = {"cmd","/C","date","/T"};

        //ejecutamos

        Process process = runtime.exec(command);

        //con el scanner/bufferreader capturamos los datos del proceso mediante un Input Stream

        Scanner scannerIS= new Scanner(process.getInputStream());

        //mientras en el Scanner hay líneas, las mostramos e imprimimos por pantalla

        while ((scannerIS.hasNextLine())){
            System.out.println(scannerIS.nextLine());
        }

        scannerIS.close();

        //esperar a que el proceso finalice
        int exitStatus=process.waitFor();
        //si se ejecuta correctamente devuelve 0, si no 1
        System.out.println("Exit status process data: "+exitStatus);

        //DISTINGUE ENTRE SALIDA NORMAL Y SALIDA DE ERROR
        //recuperamos el mensaje de error, si exitStatus devuelve 0
        if (exitStatus!=0){

            //nuevo Scanner para captar el proceso y el stream de error
            Scanner scannerError= new Scanner(process.getErrorStream());

            //mientras en el Scanner hay líneas, las mostramos e imprimimos por pantalla

            while ((scannerError.hasNextLine())){
                System.out.println(scannerError.nextLine());
            }

            scannerError.close();


        }



    }
}