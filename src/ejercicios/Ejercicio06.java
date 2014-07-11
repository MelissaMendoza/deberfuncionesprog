/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/**
 *
 * @author Melissa
 */
public class Ejercicio06 
{
    public static void main(String[] args)
    {
        String a="";
        String palabra=JOptionPane.showInputDialog(null,"Ingrese uns frase : ");
        String []frase=palabra.split(" ");
        for(int i=frase.length-1;i>=0;i--)
        {
            a=a+frase[i]+" ";            
        }
        JOptionPane.showMessageDialog(null, a);
    }
}
