/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author giangiu
 */
public class Logger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        FileWriter out;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

        System.out.println("Scrivi quello che vuoi scrivere nel file:");

        try {
            Scanner in = new Scanner(System.in);
            String c = in.nextLine();
            out = new FileWriter("data/destinazione.txt");
            out.write("Giorno ");
            out.write(dateFormat.format(new Date()));
            out.write("\n" + c);
            out.close();
        } catch (IOException ex) {
            System.out.println("ERRORE: " + ex.getMessage());
        }
    }
}
