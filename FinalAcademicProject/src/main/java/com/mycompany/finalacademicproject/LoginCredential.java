/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalacademicproject;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
/**
 *
 * @author HP
 */
public class LoginCredential {
    private final String FILENAME = "loginCredentials.txt";
    private HashMap<String, String> credentials = new HashMap<>();
    Scanner file;
    
    public LoginCredential() {
        try {
            file = new Scanner(new File(FILENAME));
            String un = "";
            String pw = "";
            while( file.hasNextLine() ) {
                un = file.nextLine();
                pw = file.nextLine();
                credentials.put(un, pw);
                System.out.println(un + " - " + pw);
            }
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("ERROR: Cannot find file " + FILENAME);
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getLocalizedMessage());
        }
    }
    
    public boolean isCredentialValid(String username, String password) {
        return (password.equals(credentials.get(username)));
    }
}
