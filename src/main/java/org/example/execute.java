package org.example;

import java.io.IOException;

public class execute {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        String [] comando = {"powershell", "Stop-Process -Id 15252"};
        Process process = runtime.exec(comando);



    }
}
