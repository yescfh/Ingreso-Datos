/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingresodatos;
import javax.swing.JOptionPane;

/**
 *
 * @author yrodr
 */
public class Ingresodatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog (null,"Bienvenidos");
        String Nombre = JOptionPane.showInputDialog ("Ingrese un texto");
        JOptionPane.showMessageDialog (null,"Hola"  +  Nombre);
        String n1 = JOptionPane.showInputDialog ("Ingrese un numero");
        String n2 = JOptionPane.showInputDialog ("Ingrese un numero");
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        
        double suma = num1 + num2;
        System.out.println("El resultado de la suma es : " + suma);
        
        JOptionPane.showMessageDialog (null,"El resultado de la suma es : " + suma);
    
        String n3 = JOptionPane.showInputDialog ("Ingrese un numero");
        String n4 = JOptionPane.showInputDialog ("Ingrese un numero");
        
        float num3 = Float.parseFloat(n3);
        float num4 = Float.parseFloat(n4);
        
        float division = num3 / num4 ;
        System.out.println("El resultado de la division de ambos numeros es : " + division);
        JOptionPane.showMessageDialog (null,"El resultado de la division de ambos numeros es : " + division);
        
        
    
    
    }
    
}
