import models.Cipher;

import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();

        boolean programRunning = true;

        while (programRunning) {
            System.out.println("Welcome! Would you like to encrypt or decrypt a statement?");
            String userEncrypt = myConsole.readLine();

            if (userEncrypt.equals("encrypt")) {
                System.out.println("Enter your statement:");
                    String statement = myConsole.readLine();
                System.out.println("Enter encryption key:");
                int key = myScanner.nextInt();

                Cipher userEncryption = new Cipher(statement, key);
                String encryption = userEncryption.isEncrypted(statement, key);

                System.out.println("Your encrypted statement is: \n" + encryption);
            }
        }
}