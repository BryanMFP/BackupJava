/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author IMPERCOMPU
 */
public class Backup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // Execute command
            //Ingresa a la carpeta del servidor
            String command = "cmd.exe /c start cd C:/Program Files/MySQL/MySQL Server 8.0/bin";

            String dbServer = "localhost";
            /* El usuario de tu base de datos*/
            String dbName = "sakila";
            /* El usuario de tu base de datos*/
            String dbUser = "root";
            /* La contraseña de la base de datos (dejarla en texto plano puede 
             ser un problema)*/
            String dbPass = "root";

            /*El nombre o ruta a donde se guardara el archivo de volcado .sql*/
            String sqlFile = "C:/Users/IMPERCOMPU/Documents/asofar.sql";

            Process child = Runtime.getRuntime().exec(command);
            /* La linea de comando completa que ejecutara el programa*/
            String command2 = "mysqldump -u " + dbUser
                    + " -p=" + dbPass + " " + dbName + " > " + sqlFile;
            Process child2 = Runtime.getRuntime().exec(command2);

            // Get output stream to write from it
        } catch (Exception e) {
        }

    }

}
