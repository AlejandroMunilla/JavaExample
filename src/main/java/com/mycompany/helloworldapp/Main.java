package com.mycompany.helloworldapp;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.io.*;

/**
 *
 * @author alexh
 */
public class Main extends JFrame 
{
   private static final long serialVersionUID = 1L;
   private int tryAttempts = 0;
    
    

    public static void main (String[] args)
    {
        System.out.println("Hello World here we are");
        Main ex = new Main();
        ex.GetInputTest();
        new Main().setVisible(true);
        
    }    
    
    public Main ()
    {
        
        super ("Title goes here");
        setSize (600,600);
        setResizable (true);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        System.out.println("My first example");
        setLayout (new FlowLayout());
        JButton button = new JButton("Button");
        add(button);
        JLabel label = new JLabel ("Hello World");
        add (label);

    //    GetInputTest();
        
    }
       
    
        
    public void GetInputTest ()
    {
        System.out.println("Enter a number from 1 to 100");
        BufferedReader keyboard = new BufferedReader (new InputStreamReader(System.in));
        int number = 0;
       
        do 
        {
            System.out.println(tryAttempts);
            try 
            {
                String inputString = keyboard.readLine();
                System.out.println(inputString);
                number = Integer.parseInt(inputString);
            }
            catch (IOException e)
            {
                System.out.println("Error at reading keyboard");
            }
            catch(NumberFormatException e)
            {
                System.out.println("Debe introducir un número entre 0 y 100.");
            }                         
            finally
            {
                tryAttempts++;
                System.out.println(tryAttempts);
            }
        }
        while (number <0 || number >101);

    }
    
}


